package start;

import domain.dayThree.Wire;
import input.Input;
import tasks.DayOne;
import tasks.DayThree;
import tasks.DayTwo;

import java.time.LocalDateTime;
import java.util.Arrays;

public class AdventOfCodeDayTwo {

    public static void main(String[] args) {

        DayTwo dayTwo = new DayTwo();
        Input input = new Input();
        input.intCode[1] = 12;
        input.intCode[2] = 2;
        System.out.println("Day two, part one: " + Arrays.toString(dayTwo.computeProgram(input.intCode)));
        input = new Input();
        System.out.println("Day two, part two: " + dayTwo.findParameters(input.intCode, 19690720));
    }
}
