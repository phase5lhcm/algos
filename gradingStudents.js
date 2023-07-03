/**
 * HackerLand University has the following grading policy:

Every student receives a  in the inclusive range from  to .
Any  less than  is a failing grade.
Sam is a professor at the university and likes to round each student's  according to these rules:

If the difference between the grade and the next multiple of 5 is less than 3, round  up to the next multiple of 5 .
If the value of grade is less than 38 , no rounding occurs as the result will still be a failing grade.
Examples
grade = 84, round to  (85 - 84 is less than 3)
 grade = 29, do not round (result is less than 40)
 grade = 57 do not round (60 - 57 is 3 or higher)
Given the initial value of  for each of Sam's  students, write code to automate the rounding process.

input is an array where arr[0] is the number of students in the class and the values after are the grades
the return value is an array of grades rounded as appropriate
 */


function gradingStudents(grades) {

  for(let i = 0; i < grades.length; i++){
      // handle failing grades since we know that any grade less than 38 is a failing grade 
      if(grades[i] < 38){
          grades[i] === grades[i];
      }
      // to determine if a grade can be rounded, we check if adding 1 or 2 will result in a multiple of 5.
      if((grades[i] + 1) % 5 === 0 && grades[i] >= 38 ){
          grades[i] = grades[i] + 1;
      }

      if((grades[i] + 2) % 5 === 0 && grades[i] >= 38){
          grades[i] = grades[i] + 2;
      }
  }
  return grades;
}

console.log(gradingStudents([73, 67, 38, 33 ]));
