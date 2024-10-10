const url = 'http://localhost:8080/api/surveys'; //or surveys
const data = {
  title: "Prueba 2",
  questions: [{
      statement: 'John',
      badOptions: ["mcenroy", "smith", "lennon"],
      rightOption: "lennon",
  }]};

fetch(url, {
  method: 'POST', // Specify the request method as POST
  headers: {
    'Content-Type': 'application/json' // Specify content type as JSON
  },
  body: JSON.stringify(data) // Convert the data object to a JSON string
})
  .then(response => response.json()) // Parse the JSON response
  .then(data => console.log('Success:', data))
  .catch(error => console.error('Error:', error));

