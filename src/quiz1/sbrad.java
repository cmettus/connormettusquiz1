package quiz1;

import java.util.Scanner;

public class sbrad {
	public static void main(String args[]) {
		double td, att, comp, ints, yds;

		Scanner in = new Scanner(System.in);
		System.out.println("How many Touchdowns?");
		td = in.nextDouble();
		System.out.println("How many pass attempts?");
		att = in.nextDouble();
		System.out.println("How many pass completions?");
		comp = in.nextDouble();
		System.out.println("How many interceptions were thrown?");
		ints = in.nextDouble();
		System.out.println("How many yards did he throw for?");
		yds = in.nextDouble();

		double a, b, c, d, l, passRating;
		a = (((comp / att) - .3) * 5);
		if (a > 2.375) {
			a = 2.375;
		} else if (a < 0) {
			a = 0;
		} else {
			a = (((comp / att) - .3) * 5);
		}
		b = (((yds / att) - 3) * .25);
		if (b > 2.375) {
			b = 2.375;
		} else if (b < 0) {
			b = 0;
		} else {
			b = (((yds / att) - 3) * .25);
		}
		c = ((td / att) * 20);
		if (c > 2.375) {
			c = 2.375;
		} else if (c < 0) {
			c = 0;
		} else {
			c = ((td / att) * 20);
		}
		d = 2.375 - ((ints / att) * 25);
		if (d > 2.375) {
			d = 2.375;
		} else if (d < 0) {
			d = 0;
		} else {
			d = 2.375 - ((ints / att) * 25);
		}

		passRating = (((a + b + c + d) / 6) * 100);

	}

}
