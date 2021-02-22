public class snake_and_ladder {

	public static final int start_position = 0;
	public static final int winning_position = 100;

	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladder Game");

		int player_position = start_position;
		System.out.println("Starting position of a player is : "+ player_position);

		while (player_position < 100 && player_position >=0 ) {
			int die_roll = (int)(Math.floor(Math.random() * 10 ) % 6) + 1;
			System.out.println("The value of a die rolled is : " + die_roll);

			player_position += die_roll;
			System.out.println("Player 1 position is : " + player_position);

			int option = (int)Math.floor(Math.random() * 10 ) % 3;
			System.out.println("Option is : " + option);

			if (option == 1) {
				player_position += 0;
				System.out.println("Player 1 stays in same position : " + player_position);
			}
			else if (option == 2) {
				player_position += die_roll;
				System.out.println("Player got a ladder. Position is : " + player_position );
			}
			else {
				player_position -= die_roll;
				System.out.println("Player got a Snake. Position is : " + player_position);
				if (player_position < 0){
                                       	player_position = 0;
                               	}

			}

			if (player_position>100)
			{
				player_position -= player_position;
			}

		}
		System.out.println("Player 1 won!!");

	}
}
