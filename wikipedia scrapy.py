import requests
from bs4 import BeautifulSoup
import pandas as pd

# Send an HTTP request to the webpage with a User-Agent header
url = 'https://en.wikipedia.org/wiki/Cloud-computing_comparison'
headers = {
    "User-Agent": "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) "
                  "AppleWebKit/537.36 (KHTML, like Gecko) Chrome/142.0.0.0 Safari/537.36"
}
response = requests.get(url, headers=headers)

# Parse the HTML content
soup = BeautifulSoup(response.content, 'html.parser')

# Print the title of the webpage safely
if soup.title:
    print("Title:", soup.title.text)
else:
    print("No title found")

# Find the first table (Wikipedia tables usually have class 'wikitable')
table = soup.find('table', {'class': 'wikitable'})

if table:
    # Extract table rows
    rows = table.find_all('tr')

    # Extract headers from the first row (using <th> tags)
    headers = [header.get_text(strip=True) for header in rows[0].find_all('th')]

    # Loop through the rows and extract data (skip the first row with headers)
    data = []
    for row in rows[1:]:
        cols = row.find_all('td')
        cols = [col.get_text(strip=True) for col in cols]
        data.append(cols)

    # Convert the data into a pandas DataFrame
    df = pd.DataFrame(data, columns=headers)

    # Display the first few rows
    print(df.head())

    # Save to CSV
    df.to_csv('scraped_data.csv', index=False)
else:
    print("No table found on the page.")
