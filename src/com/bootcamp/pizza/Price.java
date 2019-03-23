package com.bootcamp.pizza;

class Price {
    private int value;

    Price(int value) {
        this.value = value;
    }

    Price add(Price price) {
        return new Price(this.value + price.value);
    }

    @Override
    public boolean equals(Object anotherPrice) {
        Price price = (Price) anotherPrice;
        return this.value == price.value;
    }

    @Override
    public String toString() {
        return this.value+"";
    }
}
