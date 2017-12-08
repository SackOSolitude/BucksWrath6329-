# BucksWrath Frc Team 6329- Codes for robots
![](https://scontent.fzty2-1.fna.fbcdn.net/v/t1.0-1/p200x200/23621614_1895119097169785_7334045388425560233_n.png?oh=8a1ba47460b295445c007e9880f0645e&oe=5A9254F0)

## Table of contents-
- [Setting up Eclipse](https://github.com/SackOSolitude/BucksWrath6329-/blob/master/README.md#setting-up-eclipse-for-java-or-c-coding-)

- [Importing](https://github.com/SackOSolitude/BucksWrath6329-/blob/master/README.md#importing-github-projects-into-eclipse-workspace----)
  + [Easy way](//github.com/SackOSolitude/BucksWrath6329-/blob/master/README.md#easy-way--recommended-)
  + [HARD way](https://github.com/SackOSolitude/BucksWrath6329-/blob/master/README.md#second-way--clone-link--not-recommended)

- [Exporting](https://github.com/SackOSolitude/BucksWrath6329-/blob/master/README.md#exportinguploading-to-eclipse----)

- [Making changes](https://github.com/SackOSolitude/BucksWrath6329-/blob/master/README.md#changing-readmemd)

### Setting up Eclipse for Java or C++ coding-
go [here](https://wpilib.screenstepslive.com/s/currentCS/m/java/l/599681-installing-eclipse-c-java) and follow all of the steps on the website. `ALL OF THEM!!` excluding what your not using that is, for example if your coding with java only do the java steps and if your coding in c++ then only do c++ steps.

You're also going to want to install java jdk- 1.8.0 or java SE- jdk 9.0 and make sure it is properly downloaded and activated.

### Importing Github Projects into Eclipse workspace ---  
##### Easy way -`recommended`-
make sure file you wish to import has been unziped 
- hit File 
     - import 
- general
   - projects from folder or archive
- now go to the place the project is located and click once on the folder 
-` make sure there is only one file with all the contents. this may be confusing so an example is given below.`
-`say the whole file says " BucksWrath6329--master" and you want to have the project "simpledrivetrain"
you would open " BucksWrath6329--master" then the file "bucksWrath6329--master" then you would see the file "simpledrivetrain". what you do from there is click that then continue with the steps below.` 

- BucksWrath6329--master
   - BucksWrath6329--master
     - SimpleDriveTrain `
   
  
- hit import 
-  check the box next to your project name 
- hit finish and you should have the project properly imported with packages and everything!

##### Second way- Clone link- `NOT RECOMMENDED`
- Click Clone/download button on the repository page and a link will pop up, copy that - this is the link as of now: (https://github.com/SackOSolitude/BucksWrath6329-.git)
- Then go into Eclipse and right click on an empty part of the package explore
- Click import
- Left click on the folder *Git* then double click *projects from git*  
- Double click *clone URL*
- Paste the copied URL into the box to the right of *URL:* - the other boxes shall auto fill dont worry!-
- Enter username and password in the bottom part under *Authentication* 
- Click *finish* 
- Click file *java* then within that file *java project* then hit *next* 
- give it a project name then hit *finish* then *finish* again then that should be it.
>This is very unreliable and has many errors so using the first way is very recommended
##### Third way-
'in process of figuring out as so it actaully works without errors'

## Dev only Instructions
### Exporting/Uploading to Eclipse ---
+  Go to the repository main code page and to the left of the green Clone/Download button there should be an upload button. Click that or just click [here](https://github.com/SackOSolitude/BucksWrath6329-/upload/master) 
+ Now either browse for your file through the file in file explorer and drag into the drop box on the page  or hit *choose your files* and find wanted files in file explorer.
> 'Dragging and dropping into browser is much better'




### Changing README.md
-If something needs to change or be added on here then make an edit on the edits branch and what ever needs to be edited use tilde (looks like this ~ and is under Esc key) three times before and after a sentance that needs to be changed and it will put a slash through it. for example: ~~~The cake is a lie~~~ and put the needed change inside () after the sentance such as change to (THE CAKE IS A LIE). if soemthing needs to be added just add it in. anything else you need done you can contact me (devs you know me) and I know all of the steps to change or add anything. When done just hit commit changes and I'll look at it and make changes.





## Markdown Tricks- (README How to)

### Boxing in lines-
``` use three backticks( key to the left of the key labed 1 - looks like - `) before and after what you want boxed in and it will look exactly liket this line.```
also using >  works the same jsut slightly different (example below)
> looks like this 
### Making charts-
You can create tabels using pipes | and hyphens - .
A simple outline for tables you can copy, paste, and edit to your needs is provided below. The second example just aligns the chart neatly.


| First Header  | Second Header |
| ------------- | ------------- |
| Content Cell  | Content Cell  |
| Content Cell  | Content Cell  |
 will look like 
 
`| First Header  | Second Header |

| ------------- | ------------- |

| Content Cell  | Content Cell  |

| Content Cell  | Content Cell  |`

| First Header | Second Header | Third Header |
| :---         |     :---:      |  ---: |
| cell  | cell     | Cell   |
| cell     | cell      | cell      |




`| First Header | Second Header | Third Header |

| :---         |     :---:      |          ---: |

| cell  | cell     | Cell   |

| cell     | cell      | cell      |`



### Making Task lists-
- [ ] do homework assigned over weekend   
- [x]  watch Game of Thrones back to back episodes
- [x] this is a complete item
- [ ] this is an incomplete item

use this outline and edit the lines after the boxes and if incomplete delete the x and add a space.

` - [ ] TASK HERE `
` - [x] TASK HERE `





