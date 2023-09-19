import requests

URL = 'https://api.nasa.gov/DONKI/FLR?api_key=DEMO_KEY'

res = requests.get(URL)

res_txt = res.text

print(res_txt)