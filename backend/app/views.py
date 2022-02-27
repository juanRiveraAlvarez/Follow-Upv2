from django.shortcuts import render
from django.http.response import JsonResponse
from rest_framework.parsers import JSONParser
from rest_framework import status

from app.models import User
from app.serializers import UserSerializer
from rest_framework.decorators import api_view

from app.security import salt, hashed, jwt_decode, jwt_encode

@api_view(['POST'])
def save_user(request):
    if request.method == 'POST': 
        user_data = JSONParser().parse(request)
        user_data['password'] = str(hashed(user_data['password'], salt())).replace("'", "")[1:]
        user_serializer = UserSerializer(data=user_data)
        if user_serializer.is_valid():
            user_serializer.save()
            return JsonResponse(user_serializer.data, status=status.HTTP_201_CREATED)
        return JsonResponse(user_serializer.errors, status=status.HTTP_400_BAD_REQUEST)


@api_view(['POST'])
def find_user(request):
    if request.method == 'POST':
        try:
            user_data = JSONParser().parse(request)
            user = User.objects.get(email__exact=user_data['email'])
            #user_serializer = UserSerializer(user)
            return JsonResponse({"token":jwt_encode({"email":user_data["email"]})}, status=status.HTTP_202_ACCEPTED) 
        except User.DoesNotExist:
            return JsonResponse({"message":"not found"}, status=status.HTTP_400_BAD_REQUEST) 


# Create your views here.
