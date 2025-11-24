# To import the necessary libraries
import requests
from bs4 import BeautifulSoup
import pandas as pd

# send an http request to the website
url = "https://todaytvseries.one/"
response = requests.get(url)

if response.status_code == 200:
    print("Request successful")
else:
    print("Request failed")

# Parse the Html content
soup = BeautifulSoup(response.content, "html.parser")

# Print the title of the webpage to verify
print(soup.title.text)



