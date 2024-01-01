package com.design;

import java.util.Objects;

class HelloWorld {
    public static void main(String[] args) {
      Cordinates c = new Cordinates(0,0);
      Cordinates c1 = new Cordinates(1,1);
      Cordinates c2 = new Cordinates(1,1);
      Cordinates c3 = new Cordinates(2,1);
      Cordinates c4 = new Cordinates(1,2);
      System.out.println(c);
      System.out.println(c1);
      System.out.println(c2);
      System.out.println(c1.equals(c2));
      System.out.println(c1 == c2);
    }
    
    static class Cordinates {
        int x;
        int y;
        Cordinates(int x, int y){
            this.x = x;
            this.y = y;
        }
		@Override
		public int hashCode() {
			return Objects.hash(x, y);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Cordinates other = (Cordinates) obj;
			return x == other.x && y == other.y;
		}
        
        
    }
}