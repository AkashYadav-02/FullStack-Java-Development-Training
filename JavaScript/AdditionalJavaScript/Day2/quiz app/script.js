// quiz.js
 console.log("script is running ");
const quizQuestions = [
    {
      question: "What is the capital of France?",
      choices: ["a) Berlin", "b) Madrid", "c) Paris", "d) Rome"],
      correctAnswer: "c",
    },
    {
      question: "Which planet is known as the 'Red Planet'?",
      choices: ["a) Venus", "b) Mars", "c) Jupiter", "d) Neptune"],
      correctAnswer: "b",
    },
    {
      question: "What is the largest mammal in the world?",
      choices: ["a) Elephant", "b) Giraffe", "c) Blue Whale", "d) Hippopotamus"],
      correctAnswer: "c",
    },
    {
      question: "Which gas do plants use for photosynthesis?",
      choices: ["a) Oxygen", "b) Carbon Dioxide", "c) Nitrogen", "d) Hydrogen"],
      correctAnswer: "b",
    },
    {
      question: "Which is the smallest prime number?",
      choices: ["a) 0", "b) 1", "c) 2", "d) 3"],
      correctAnswer: "c",
    },
    {
      question: "What is the chemical symbol for gold?",
      choices: ["a) Au", "b) Ag", "c) Go", "d) Gd"],
      correctAnswer: "a",
    },
    // Add more questions here...
  ];
  
  function displayQuestion(questionObj, questionNumber) {
    const quizContainer = document.getElementById("quiz-container");
  
    const questionDiv = document.createElement("div");
    questionDiv.classList.add("question");
    
    const questionText = document.createElement("p");
    questionText.textContent = `Q${questionNumber + 1}. ${questionObj.question}`;
    questionDiv.appendChild(questionText);
  
    const choicesList = document.createElement("ul");
    choicesList.classList.add("choices");
    
    questionObj.choices.forEach((choice, index) => {
      
      const choiceItem = document.createElement("li");
      const choiceInput = document.createElement("input");
      choiceInput.type = "radio";
      choiceInput.name = `q${questionNumber}`;
      choiceInput.value = choice.charAt(0);
      choiceItem.textContent = choice;
      choiceItem.prepend(choiceInput);
      choicesList.appendChild(choiceItem);
    });
    
    questionDiv.appendChild(choicesList);
    quizContainer.appendChild(questionDiv);
  }
  
  function checkAnswer(questionObj, userChoice) {
    return userChoice === questionObj.correctAnswer;
  }
  
  let totalScore = 0;
  
  quizQuestions.forEach((question, index) => {
    displayQuestion(question, index);
  });
  
  const submitButton = document.createElement("button");
  submitButton.textContent = "Submit Quiz";
  submitButton.addEventListener("click", calculateScore);
  
  document.getElementById("quiz-container").appendChild(submitButton);
  
  function calculateScore() {
    const userResponses = document.querySelectorAll("input[type='radio']:checked");
  
    userResponses.forEach(response => {
      const questionIndex = parseInt(response.name.charAt(1));
      const isCorrect = checkAnswer(quizQuestions[questionIndex], response.value);
      if (isCorrect) {
        totalScore+=5;
      }
    });
     alert(`Your total score is: ${totalScore}`);
  
    // const resultContainer = document.createElement("div");
    // resultContainer.classList.add("result");
    
    // const resultText = document.createElement("p");
    // resultText.textContent = `Your total score is: ${totalScore}`;
  
    // resultContainer.appendChild(resultText);
  
    // document.getElementById("quiz-container").appendChild(resultContainer);
  }


 
  
  const resetButton = document.createElement("button");
  resetButton.s
  resetButton.textContent = "Retake ";
  resetButton.addEventListener("click", () => {
    
    
    const radioInputs = document.querySelectorAll("input[type='radio']:checked");
  radioInputs.forEach(input => {
    input.checked = false;
  });

  // Reset the total score
  totalScore = 0;
   
    
  });

  
  document.getElementById("quiz-container").appendChild(resetButton);