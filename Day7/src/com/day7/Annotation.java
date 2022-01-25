package com.day7;

import java.lang.reflect.Method;




public class Annotation {
	public static void main(String[] args) throws ClassNotFoundException {

		Class<?> clazz = Class.forName("com.day7.AnnotatedClass");
		
		Method[] methods = clazz.getDeclaredMethods();
		for (Method method : methods) {
//			readAnnotation(method);
			
			if (method.isAnnotationPresent(Author.class)) {
				
				Author author = method.getAnnotation(Author.class);

				System.out.println(author.name());

			}
			if (method.isAnnotationPresent(Version.class)) {

				Version version = method.getAnnotation(Version.class);

				System.out.println(version.number());

			}
		}
	}
		}
	
