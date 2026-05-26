public int getPointsForRow(int targetRow) {
  int numPoints = 0;
  
  for (int c = 0; c < board[0].length; c++) {
    numPoints += board[targetRow][c].getPoints();
    if (board[targetRow][c].getColor().equals(board[targetRow][0].getColor()) {
      numPoints *= 2;
    }
  }
return numPoints;




  }
