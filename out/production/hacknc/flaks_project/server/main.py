import requests
import json

api_url = 'http://127.0.0.1:8080/'

response = requests.get(api_url)
print(response.text)

response = requests.post(api_url)
print(response.text)