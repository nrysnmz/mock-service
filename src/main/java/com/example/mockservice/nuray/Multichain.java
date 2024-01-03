package com.example.mockservice.nuray;




        public class Multichain {
            private int value;

            public Multichain setValue(int value) {
                this.value = value;
                return this; // Returning the current object
            }

            public Multichain add(int x) {
                this.value += x;
                return this; // Returning the current object
            }

            public Multichain multiply(int y) {
                this.value *= y;
                return this; // Returning the current object
            }

            public int getValue() {
                return value;
            }

            public static void main(String[] args) {
                Multichain example = new Multichain();

                int result = example.setValue(5).add(3).multiply(2).getValue();
                System.out.println("Result: " + result); // Output: Result: 16
            }
        }




