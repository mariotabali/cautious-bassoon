const url = 'http://localhost:8080/api/attempt';
const data = {
    testId: 1,
    answers: [
        {
            questionId: 1,
            answer: "mcenroy",
        },
        {
            questionId: 2,
            answer: "hello",
        },
    ],
};

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