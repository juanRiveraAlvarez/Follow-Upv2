import bcrypt
from jwt import encode, decode

def salt():
    return bcrypt.gensalt()

def hashed(password,salt):
    return bcrypt.hashpw(password.encode('utf8'), salt)

def jwt_encode(param):
    return encode(param,"secret",algorithm="HS256")

def jwt_decode(encode_jwt):
    return decode(encode_jwt,"secret",algorithm="HS256")
