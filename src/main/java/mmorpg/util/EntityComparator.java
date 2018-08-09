package mmorpg.util;

/**
 * Copyright (c) 2012 Sean Beecroft, Permission is hereby granted, free of
 * charge, to any person obtaining a copy of this software and associated
 * documentation files (the "Software"), to deal in the Software without
 * restriction, including without limitation the rights to use, copy, modify,
 * merge, publish, distribute, sublicense, and/or sell copies of the Software,
 * and to permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 * 
 * For more information on this project and others, please visit my google code 
 * repository:
 * https://code.google.com/u/seanbeecroft@gmail.com/
 */
import java.util.Comparator;
import mmorpg.model.Entity;


public class EntityComparator implements Comparator{
 
    public int compare(Object emp1, Object emp2){    
 
        //parameter are of type Object, so we have to downcast it to Employee objects
       
        String emp1Name = ((Entity)emp1).getName();        
        String emp2Name = ((Entity)emp2).getName();
       
        //uses compareTo method of String class to compare names of the employee
        return emp1Name.compareTo(emp2Name);
   
    }
 
}