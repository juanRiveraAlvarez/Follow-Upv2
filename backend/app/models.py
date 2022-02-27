from django.db import models

class User(models.Model):
    name = models.CharField(max_length=50, blank=False, default='')
    email = models.CharField(max_length=50, blank=False, default='')
    password = models.CharField(max_length=500, blank=False, default='')
# Create your models here.
