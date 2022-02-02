package com.java8.case_study2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

import com.java8.case_study2.Dish.Type;

public class DishTest {
	public DishSelectedField getDishSelectedField(Dish d) {
		return new DishSelectedField(d.getName(), d.getCalories());
	}

	public static void main(String[] args) {

		List<Dish> allDishes = getAllDishes();
		// Example: return the names of dishes that are low in calories (<400) sorted by
		// number of calories

		allDishes.stream().filter(d -> d.getCalories() < 400).sorted(Comparator.comparing(Dish::getCalories))
				.forEach(System.out::println);

		// Getting all veg dishes

		allDishes.stream().filter(d -> d.isVegetarian() == true).map(d -> d.getName()).forEach(System.out::println);

		// Get list of All Dishes only containing name and calValue

//		allDishes
//		.stream()
////		.filter(d->d.isVegetarian()==true)
//		.map(d->d.getName(),d1->d1.getCalories())
//		.forEach(System.out::println);

		// create a List by selecting the first three dishes that have more than 300
		// calories

		allDishes.stream().filter(d -> d.getCalories() >= 300).sorted(Comparator.comparing(Dish::getCalories)).limit(3)
				.forEach(System.out::println);

		/*
		 * allMatch, anyMatch,noneMatch, findFirst, findAny
		 */

//****doubt
		// find out whether the menu has a vegetarian option: anyMatch

		System.out.println(allDishes.stream().anyMatch(d -> d.isVegetarian() == true));

		// find out whether the menu ishealthy :allMatch

		System.out.println(allDishes.stream().allMatch(d -> d.getCalories() < 1000));

		// (ie. all dishes are below 1000 calories):

		// noneMatch: opposite of allMatch

		System.out.println(allDishes.stream().noneMatch(d -> d.getCalories() < 1000));

		// find if any food item is veg? findAny

		Optional<Dish> vegDishes = allDishes.stream().filter(d -> d.isVegetarian() == true).findAny();
		System.out.println(vegDishes.orElse(null));

		// Primitive stream specializations

		// IntStream,DoubleStream, and LongStream==> avoid boxing cost

		// get all the cal values of all food items

		int totalCal = allDishes.stream().map(d -> d.getCalories()).reduce(0, Integer::sum);

		// using primitive stream

		int totalCal2 = allDishes.stream().mapToInt(d -> d.getCalories()).sum();

		// find max cal values for all dishes

		OptionalInt val = allDishes.stream().mapToInt(d -> d.getCalories()).max();

		System.out.println(val.orElse(-1));

		/*
		 * What type of quaries Collect helps: ------------------------------------- 1.
		 * Dishes grouped by type 2. Dishes grouped by caloric level 3. Dishes grouped
		 * by type and then caloric level 4. Count dishes in each groups 5. Most caloric
		 * dishes by type 6. Sum calories by type
		 */

		// Dishes grouped by type
		Map<Object, List<Dish>> collect = allDishes.stream().collect(Collectors.groupingBy(d -> d.getType()));

		// Dishes grouped by caloric level
//		allDishes.stream().collect(Collectors.groupingBy(Dish::getCalLevel));

		// Most caloric dishes by type
		// ie i want to find out most caloric dish (if any ) in each dish type

		Map<Integer, List<Dish>> collect2 = allDishes.stream().collect(Collectors.groupingBy(Dish::getCalories));

		/*
		 * Map<Integer, Optional<Dish>> collect3 = allDishes.stream()
		 * .collect(Collectors.groupingBy(Dish::getCalories, Collectors.reducing((Dish
		 * t, Dish u) -> t.getCalories() > u.getCalories() ? t: u)));
		 */
	}

	// Dishes grouped by type and then caloric level
//	private static CaloricLevel getCalLevel(Dish dish) {
//		if (dish.getCalories() <= 400)
//			return CaloricLevel.DIET;
//		else if (dish.getCalories() <= 700)
//			return CaloricLevel.NORMAL;
//		else
//			return CaloricLevel.FAT;
//	}

	private static List<Dish> getAllDishes() {
		List<Dish> dishes = Arrays.asList(new Dish("pork", false, 1800, Dish.Type.MEAT),
				new Dish("beef", false, 7700, Dish.Type.MEAT), new Dish("chicken", false, 400, Dish.Type.MEAT),
				new Dish("french fries", true, 530, Dish.Type.OTHER), new Dish("rice", true, 350, Dish.Type.OTHER),
				new Dish("season fruit", true, 120, Dish.Type.OTHER), new Dish("pizza", true, 550, Dish.Type.OTHER),
				new Dish("prawns", false, 300, Dish.Type.FISH), new Dish("salmon", false, 450, Dish.Type.FISH));

		return dishes;
	}

}
