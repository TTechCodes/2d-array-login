package mulitpleArray;

class Node {

	private int userNumber = 1;
	private String [][] user = new String[userNumber][4];

	 protected Node(String fn, String ln, String un, String pw){
		userNumber++;
		user[userNumber-2][0] = fn;
		user[userNumber-2][1] = ln;
		user[userNumber-2][2] = un;
		user[userNumber-2][3] = pw;

	}
	 
	protected void print2D(){
        // Loop through all rows
		
        for (int i = 0; i < user.length; i++)
 
            // Loop through all elements of current row
            for (int j = 0; j < user[i].length; j++) {
                System.out.print(user[i][j] + " ");
            }
        System.out.println("all info stored to 2d array");
    }
}




