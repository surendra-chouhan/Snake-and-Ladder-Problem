public class snake_and_ladder {

	public static final int start_position = 0;

	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladder Game");

		int player_position = start_position;
		System.out.println("Starting position of a player is : "+ player_position);

		int die_roll = (int)(Math.floor(Math.random() * 10 ) % 6) + 1;
		System.out.println("The value of a die rolled is : " + die_roll);



	}

}
