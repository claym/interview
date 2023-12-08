package net.claymitchell.neetcode.queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class StudentNoLunch1700 {

    public int countStudents(int[] students, int[] sandwiches) {

        LinkedList<Integer> studentQ = new LinkedList<>(Arrays.stream(students).boxed().toList());
        LinkedList<Integer> sandwichS = new LinkedList<>(Arrays.stream(sandwiches).boxed().toList());
        int lastAccepted = 0;
        while(!sandwichS.isEmpty() && !studentQ.isEmpty() && lastAccepted < studentQ.size()) {
            // we know the student is going to be discarded or sent to the back of the line
            int student = studentQ.pop().intValue();
            // we may not use this sandwich, just peek
            int sandwich = sandwichS.peek().intValue();

            if(student == sandwich) {
                // student wants this sandwich, remove from both queues
                sandwichS.pop();
                lastAccepted = 0;
            } else {
                // student doesn't want sandwich, move him to back of line, keep sandwich
                studentQ.add(student);
                lastAccepted++;
            }
        }
        return studentQ.size();
    }


}
