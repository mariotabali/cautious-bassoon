const url = 'http://localhost:8080/api/attempt/score/1';


fetch(url, {
  method: 'GET', // Specify the request method as POST
})
  .then(response => response.json()) // Parse the JSON response
  .then(data => console.log('Success:', data))
  .catch(error => console.error('Error:', error));