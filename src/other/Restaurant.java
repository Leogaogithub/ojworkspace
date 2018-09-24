package other;

import java.util.ArrayList;

/**
 * Created by leo on 9/8/18.
 */
    public class Restaurant {

        static int index = 1;
        String restaurantName;
        String location;
        int curIndex;

        Restaurant(final String restaurantName, final String location) {
            this.restaurantName = restaurantName;
            this.location = location;
            this.curIndex = index++;
        }

        public static void main(final String[] input) {
            final ArrayList<Restaurant> restaurant = new ArrayList<Restaurant>();
            restaurant.add(new Restaurant("pizzahut", "bangalore"));
            restaurant.add(new Restaurant("dominos", "delhi"));

            restaurant.forEach(r -> System.out.println(r));
        }

        public String toString() {
            return "\n" + curIndex + ". " + this.restaurantName +
                    "\t\t" + this.location;
        }
    }
