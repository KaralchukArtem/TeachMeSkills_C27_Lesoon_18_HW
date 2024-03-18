# TeachMeSkills_C27_Lesson_18_HW
## Homework for lesson #18
### 1. Task #1
App generates List<Integer> filled by random values from 0 to 20.
Using Stream app:

 - provides only distinct values;
 - provides only even elements within 7 - 17 range;
 - provides list with multiplied by 2 elements;
 - provides sorted first 4 elements;
 - provides count of stream elements;
 - provides average of all elements in stream;
   
App contains:

 - "CreateListFactory" class generates List<Integer> filled by random values from 0 to 20; 
 - "ListService" class implements required tasks (mentioned above); 
 - "Runner" get default list, prints it and calls all methods from "ListService" class.

### 2. Task #2
App generates List<String> filled by names of all C27-onl group students.
Using Stream app:

 - filter all names which starts with a (case ignored);
 - sort all collection and provide first element;
   
App contains:

 - "StudentsFactory" class generates List<String> filled by names of all C27-onl group students;
 - "StudentsService" class implements required tasks (mentioned above);
 - "Runner" get default list, prints it and calls all methods from "StudentsService" class.
