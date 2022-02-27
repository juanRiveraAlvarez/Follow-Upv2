from django.urls import path
from app import views

urlpatterns=[
        path('save', views.save_user, name="save_user"),
        path('auth', views.find_user, name="find_user"),
        ]
