
C:\Users\HP>git -v
git version 2.47.1.windows.1

C:\Users\HP>git config --global user.name
NARESHGUPTA0912

C:\Users\HP>git config --global user.email
nareshgupta0912@gmail.com

C:\Users\HP>git config --global --list
filter.lfs.process=git-lfs filter-process
filter.lfs.required=true
filter.lfs.clean=git-lfs clean -- %f
filter.lfs.smudge=git-lfs smudge -- %f
user.name=NARESHGUPTA0912
user.email=nareshgupta0912@gmail.com
gui.recentrepo=C:/Users/HP/JAVA LEARNING

C:\Users\HP>git config --global user.name "New Name"

C:\Users\HP>git config --global user.name "NareshGupta0912"

C:\Users\HP>git config --global user.email "nareshgupta0912@gmail.com"

C:\Users\HP>git config --global core.editor "code --wait"

C:\Users\HP>git config --global core.autocrlf true

C:\Users\HP>git config --global --list
filter.lfs.process=git-lfs filter-process
filter.lfs.required=true
filter.lfs.clean=git-lfs clean -- %f
filter.lfs.smudge=git-lfs smudge -- %f
user.name=NareshGupta0912
user.email=nareshgupta0912@gmail.com
gui.recentrepo=C:/Users/HP/JAVA LEARNING
core.editor=code --wait
core.autocrlf=true
-----------------------------------------
create new folder: git init

<!-- 24 mar -->
Working Area(changes) ----> Stagging Area(Staged Changes) ------> commit

download git-autoconfig extension on vscode
after that user.name || user.email asked entered it then it shows git config successfully.

if :
undefined undefined
custom
root
then click on custom it again asked user.name || user.email 

-> git commit -m " msg "


# Git Abbreviations:
U -> Untracked
A -> Added
M -> Modified
R -> Rename
D -> Delete
! -> Conflict

# Changes to Stagged
For commit all files
-> git add .  

For commit one file
-> git add <FileName>

# Staged to Changes
For one file
-> git rm --cached <FileName>
For multiple files
-> git rm --cached -r .

commit amend: changes in prev commit (it cannot create new commit)
cmd: git commit --amend --no-edit

First commit aka root commit.
Head points on Last Commit. 

make sure main(branch) shown in bottom left corner

if master shows instead of main (Master is folder):
-> git branch -M main

local-repo(system folder) to github-repo(remote repo)
-> git remote add origin https://github.com/NARESHGUPTA0912/Github-Lecture.git

_for edit remote origin_: 
-> git remote set-url origin <new_url>
if repo origin does not exist then:
-> (alternative): git remote remove origin after that add again

origin is a github-repo url.
# Push code command on github:
-> git push -u origin main


---------------------------------------------------------------

git remote add origin https://github.com/NARESHGUPTA0912/Github-Lecture.git
PS C:\Users\Public\Git> git push -u origin main
Enumerating objects: 6, done.
Counting objects: 100% (6/6), done.
Delta compression using up to 12 threads
Compressing objects: 100% (2/2), done.
Writing objects: 100% (6/6), 451 bytes | 112.00 KiB/s, done.
Total 6 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
To https://github.com/NARESHGUPTA0912/Github-Lecture.git
 * [new branch]      main -> main
branch 'main' set up to track 'origin/main'.

-----------------------------------------------------------------