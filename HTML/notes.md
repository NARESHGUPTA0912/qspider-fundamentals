# Tag:-
1. Keywords enclosed by angular brackets(<>) is known as Opening or starting of a tag.
<keyword> -----> Opening tag

2. when forward slash (/) with keyword enclosed by angular brackets (<>) is known as closing or ending of a tag.
</keyword> -----> Closing tag

# Types of a tag:-
1. Pair tag:- The tag we need to closed are referred as pair tag.
2. Unpair Tag:- The tag we need not to close are referred as unpair tag.
<body></body>
<br>
<img>

# Element:- 
It is the combination of opening tag and content with closing tag.
<p> Hello world </p>

# Void Element:- 
The tags which can not hold any content is known as void element.

# Root Element:-
It is the combination of opening html tag and content and closing html tag.

# Attributes in HTML:-
1. Attributes means characteristics and properties of a tag.
2. We are using attributes so that tag can behave in our desired manner.
3. Attributes should be written inside an opening tag.
4. If we write in closing tag it won't work.

Example:-
<img src="" alt="" width="" height=""> 
<a href=""></a>
<link rel="value" href="value" crossorigin>

# Boiler Plate Code:- 
The basic structure of our web page we are generating from emmet is known as Boiler plate code.

# Shortcut:-
1. ctrl + b:- Close or Open Primary Sidebar
2. alt + z:- wrapping on
3. ctrl + c:- copy 
4. ctrl + x:- cut 
5. ctrl + v:- paste
6. ctrl + z:- undo
7. ctrl + y:- do
8. ctrl + s:- save
9. alt + L + alt + o:- Open live server
10. window + v:- copy history
11. ctrl + / :- Comment
12. ctrl + \:-  Split screen in vs code
13. alt + tab:- switch to another app
14. alt + shift + down key:- copy line down
15. alt + click:- Multi cursor
16. alt + shift + click:- Advance Multi cursor
17. alt + shift + I:-  Add cursor to line end
18. window + d:- Go to Desktop
19. window + e:- open file explorer
20. alt + f4:- shutdown/ close the open tabs

# Day-2 Hyperlink Lecture
# Hyperlink:-
1. Hyperlink is used to link or attach different documents to our web/html page.
2. To create hyperlink we use anchor tag(<a href=""></a>).

# Attributes of Anchor Tag:-
1. href:- To mention the path or location or hyper reference we use href attribute.

2. target:- Target attribute is used to specify where to open the link.
valuse:- _self, _blank, _top, _parent

# Default stages of anchor tag:-
1. Not visited:- sky blue
2. Active:- Red
3. Visited:- purple


# Day-3 List Lecture
# List:- 
List is collection or group of related items.
# Types of List:-
List are of 3 types
1. Ordered List   :- <ol></ol>
2. Unordered List:-  <ul></ul>
3. Description List:- <dl></dl>

# Day-4 Table
# Table in HTML:-
1. It is collection of rows and columns.
2. To create table in html we use <table></table> tag.
3. Here we are creating table row by row.
4. To create table row we use <tr></tr> tag.
5. To create cells html provide 2 tags
    i) <th></th> tag:- It is used to create table heading cells.
   ii) <td></td> tag:- It is used to create table data cells.
6. To provide title or caption to the table we use <caption></caption> tag.
7. caption tag we have to write within table tag.

# Cellspaning:-
1. rowspan:- rowspan is an attribute used to span the cells on row basis.
2. colspan:- colspan is an attribute used to span the cells on column basis.

Note:- 
1. Rowspan and colspan attribute we used inside Th and td tag.
2. We can use together rowspan and colspan attribute.
<Th rowspan="2" colspan="3"></th>
<Td rowspan="5" colspan="2"></th>

# Thead Tag:-
The top most part of our table we have to write within <thead></thead> tag.
# Tfoot Tag:-
The bottom most part of our table we have to write within <tfoot></tfoot> tag.
# Tbody Tag:-
The remaining content of our table we have to write within <tbody></tbody> tag.
# Importance of thead, tbody and tfoot tag:-
Thead, Tbody and Tfoot tag are highly recommend to use inside table for better explanation of code and crawler understanding purpose.

# Form in HTML:-
1. Forms are used to accept input from the user.
2. To create form in html we use <form></form> tag.
3. Here we are accepting input from the user inside an input field.
4. To create input field we use input tag. It is unpair tag.
        <input type="text">

5. syntax:- 
        <form action="#">
            Username <input type="text">   
            Email <input type="email">   
            Password <input type="password">   
        </form>

# action attribute inside form tag:-
The action attribute inside an HTML <form> tag tells the browser where (which URL or file) to send the form data when the user submits the form.        

# Attribute of Input Tag:-
1. type:- type attribute is used to specify which type of data we can accept in that input field.

type="_______"

        1. text
        2. tel
        3. email
        4. password
        5. file mutliple attribute
        6. date
        7. time
        8. datetime-local
        9. search
        10. url
        11. range
        12. color
        13. number
        14. radio
        15. checkbox
        16. hidden

2. name:- name attribute is used to provide name to the input field.
3. value:- value attribute is used to provide initial (starting) value to the input field.
4. disabled:- Input field is disabled. User can not access the input field.
5. readonly:- It will make the input field as readonly. user can access the input field but can not change or edit the value.
6. required:- It will make the input field as required or mandatory to be filled. If input field is empty form will not be submitted.
7. placeholder:- It is used to provide hint to the user.
8. autofocus:- It will automatically focus an input field after page reload or page open.
9. autocomplete:- It is used to provide suggestions to the user.
10. maxlength:- 10
11. minlength:- 2

# Input:- 
1. Input tag is single line input field.
2. It is unpair tag.

# Textarea:- 
1. It is used to create multi line input field.
2. It is pair tag.

cols attribute:- width of text area
rows attribute:- height of text area

# Label Tag:-
1. Label tag is used to connect text with the input field.
2. The text we want to connect we have to write within label tag.
3. To connect text with the input field we have to use id attribute inside input tag.
4. That id's value we have to pass to the label tag for attribute.
5. whenever user click on that text if will focus the respective input field.

# Fieldset tag:-
1. Fieldset tag is used to group form control and it is used to create one box around the form elements.
2. Fieldset tag we have to write within form tag.

# Legend Tag:-
1. Legend tag is used to provide title or caption to the fieldset tag.
2. Legend tag we have to write within fieldset tag.

# Select tag:- Select List/ Dropdown List
1. Select Tag is used to create select list or dropdown list.
2. To create select list we use select tag.
3. To create options we use option tag.
4. Option tag we have to write within select tag.

<select name="" id="">
        <option value=""></option>
        <option value=""></option>
        <option value=""></option>
        <option value=""></option>
</select>


# Datalist/ Suggestion List/ Autocomplete List:-
# Datalist tag:- Id attribute
# Input Tag:- list attribute

1. The Datalist Tag is introduced in Html-5.
2. The Html datalist tag is used to provide an autocomplete feature on the form element.
3. Datalist tag is a container tag.
4. It is block level element.
5. It is used to provide a list of predefined options to the users.
6. Datalist tag is used to create suggestion list or autocomplete list.
7. The <datalist> tag contains a set of <option> tags that define the options in the list.
8. We are binding the suggestion list with the input field, for this we have to provide 'list' attribute in the input tag and 'id' attribute in the datalist tag, this same 'id' we have to provide in the 'list' attribute of input tag.
9. Whenever the user inputs in the input field related suggestions are displayed. 
10. The advantage of using the datalist tag is that it allows users to enter values that are not present in the options list.

# Last Topics:- 
# Types of Element:-
Elements are of 2 type
1. Inline level element:- 
   i) It occupy space required by its content.
   ii) we can not set height and width. 
2. Block level element:-
        i) It always take full width of its parent container.
        ii) we can set height and width.
        

# Id and Class
# Div and Span:-
Div:- Div tag is used to create block level container
Span:- Span tag is used to create inline level container.

# Details and Summary

# Semantic Tag:-
It is self explanatory tag.

Header
Nav
Main
Section
Article
Aside
Footer

