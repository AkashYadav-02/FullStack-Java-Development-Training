let board = [
  ["", "", ""],
  ["", "", ""],
  ["", "", ""],
];

let currentPlayer = "X";
let gameIsOver = false;

function printBoard() {
  console.log("Current Board:");
  for (let row = 0; row < 3; row++) {
    console.log(board[row].join(" | "));
    if (row < 2) {
      console.log("---------");
    }
  }
  return ;
}

function validateSymbol(symbol) {
  return symbol === "X" || symbol === "O";
}

function validateCell(cell) {
  return (
    cell >= 1 &&
    cell <= 9 &&
    board[Math.floor((cell - 1) / 3)][(cell - 1) % 3] === ""
  );
}

function announceResult(result) {
  console.log(result);
  gameIsOver = true;
  return ;
}

function makeMove(symbol, cell) {
  if (gameIsOver) {
   
    return "The game is over.";
  }

  if (!validateSymbol(symbol)) {
    
    return "Invalid symbol. Please use 'X' or 'O'.";
  }

  if (!validateCell(cell)) {
   
    return "Invalid cell. Please choose an empty cell between 1 and 9.";
  }

  const row = Math.floor((cell - 1) / 3);
  const col = (cell - 1) % 3;
  board[row][col] = symbol;

  printBoard();

  if (checkWin(symbol)) { 
    announceResult(`Player ${symbol} wins!`);
    gameIsOver=true;
  } else if (checkDraw()) {
    announceResult("It's a draw!");
    gameIsOver=true;
  } 
}

function checkWin(symbol) {
  for (let i = 0; i < 3; i++) {
    if (
      board[i][0] === symbol &&
      board[i][1] === symbol &&
      board[i][2] === symbol
    ) {
      return true;
    }
    if (
      board[0][i] === symbol &&
      board[1][i] === symbol &&
      board[2][i] === symbol
    ) {
      return true;
    }
  }

  if (
    board[0][0] === symbol &&
    board[1][1] === symbol &&
    board[2][2] === symbol
  ) {
    return true;
  }

  if (
    board[0][2] === symbol &&
    board[1][1] === symbol &&
    board[2][0] === symbol
  ) {
    return true;
  }

  return false;
}

function checkDraw() {
  for (let row = 0; row < 3; row++) {
    for (let col = 0; col < 3; col++) {
      if (board[row][col] === "") {
        return false;
      }
    }
  }
  return true;
}

function playTicTacToe(symbol, cellno) {
  console.log(makeMove(symbol, cellno));
}

for (let index = 0; index < 9; index++) {
  console.log(playTicTacToe("X", index));
}
