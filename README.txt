We have a car and we want to know the value (money) of the fuel in the tank.

a) we have records of every gas station visit with quantity bought and price
b) we assume that the engine always consumes older fuel first (FIFO)
c) we don't care about the capacity of the tank, this is not relevant to the problem, we assume normal use

We want to know the exact value (in money) of the current quantity of fuel inside the car's tank.

************** Assume that you have a gauge that tells you exactly the current quantity in litters. **************

It might look logical to start from the very beginning using the oldest historical gas visits
and also any fuel that was inside the car by the factory at a given price.

But you also can take into account that all those historic fuels have long been consumed
and do not have any role in current price calculation since the current composition of the fuel is a result of recent
gas station visits and also consumption.

Use any language you like (java, python, C, C++) or even pseudo code (but we prefer java).
