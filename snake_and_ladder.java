public class snake_and_ladder {

	public static final int start_position = 0;
	public static final int winning_position = 100;

	public int total_die_rolls(){
		int roll_index = 0;
		int player_position = start_position;


		while (player_position < 100 && player_position >=0 ) {
			int die_roll = (int)(Math.floor(Math.random() * 10 ) % 6) + 1;

			roll_index++;
			player_position += die_roll;

			int option = (int)Math.floor(Math.random() * 10 ) % 3;

			if (option == 1) {
				player_position += 0;
			}
			else if (option == 2) {
				player_position += die_roll;
			}
			else {
				player_position -= die_roll;

				if (player_position < 0){
	                               	player_position = 0;
				}
			}
			if (player_position>100)
			{
				player_position -= player_position;
			}
		}
		return roll_index;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladder Game");

		snake_and_ladder sl = new snake_and_ladder();
		int player1_rollindex = sl.total_die_rolls();

		System.out.println("Total number of times the die was rolled for player 1 is : " + player1_rollindex);

		snake_and_ladder sl2 = new snake_and_ladder();
		int player2_rollindex = sl2.total_die_rolls();
		System.out.println("Total number of times the die was rolled for player 2 is : " + player2_rollindex);

		if ( player1_rollindex == player2_rollindex )
			System.out.println("It is a tie!!!");
		else if (player1_rollindex > player2_rollindex)
			System.out.println("Player 2 is the winner!!!");
		else
			System.out.println("Player 1 is the winner!!!");

	}
}
