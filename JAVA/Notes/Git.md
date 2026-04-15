<!--
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
-> git remote add origin <https://github.com/NARESHGUPTA0912/Github-Lecture.git>

_for edit remote origin_:
-> git remote set-url origin \<new\_url>
if repo origin does not exist then:
-> (alternative): git remote remove origin after that add again

origin is a github-repo url.

# Push code command on github:

-> git push -u origin main

---

git remote add origin <https://github.com/NARESHGUPTA0912/Github-Lecture.git>
PS C:\Users\Public\Git> git push -u origin main
Enumerating objects: 6, done.
Counting objects: 100% (6/6), done.
Delta compression using up to 12 threads
Compressing objects: 100% (2/2), done.
Writing objects: 100% (6/6), 451 bytes | 112.00 KiB/s, done.
Total 6 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
To <https://github.com/NARESHGUPTA0912/Github-Lecture.git>

* \[new branch] main -> main
  branch 'main' set up to track 'origin/main'.

---

For creating repo from Command line:
echo "# react-learning" >> README.md

\-------------------------------------------------------------------- -->

🚀 Git Complete Guide (git.md)
🔧 1. Initial Setup
git --version

git config --global user.name "NareshGupta0912"
git config --global user.email "<nareshgupta0912@gmail.com>"

git config --global core.editor "code --wait"
git config --global core.autocrlf true

git config --global --list
📂 2. Initialize Repository
git init
🔄 3. Git Workflow (Core Concept)
Working Directory → Staging Area → Repository (Commit)
Working Directory → where you edit files
Staging Area → selected changes (git add)
Repository → saved commits (git commit)
📌 4. Basic Commands
➤ Check Status
git status
➤ Add Files
git add .
git add <fileName>
➤ Remove from Staging
git rm --cached <fileName>
git rm --cached -r .
➤ Commit Changes
git commit -m "message"
➤ Modify Last Commit
git commit --amend --no-edit
🔤 5. File Status Codes
U → Untracked
A → Added
M → Modified
R → Renamed
D → Deleted
! → Conflict
📜 6. View History
git log
git log --oneline
git log --graph
🌿 7. Branching (Very Important)
➤ Create Branch
git branch <branchName>
➤ Switch Branch
git checkout <branchName>
➤ Create + Switch
git checkout -b <branchName>
➤ Rename to main
git branch -M main
➤ Delete Branch
git branch -d <branchName>
🔀 8. Merging
➤ Merge Branch
git merge <branchName>
Combines changes from another branch
May create merge conflicts
⚔️ 9. Merge Conflicts
Happens when same file edited in multiple branches
Git marks conflict → you manually fix → then:
git add .
git commit
🌐 10. Remote Repository (GitHub)
➤ Add Remote
git remote add origin \<repo\_url>
➤ View Remote
git remote -v
➤ Change Remote
git remote set-url origin \<new\_url>
➤ Remove Remote
git remote remove origin
🚀 11. Push & Pull
➤ Push Code
git push -u origin main
➤ Pull Code
git pull origin main
➤ Fetch (only download)
git fetch
📥 12. Clone Repository
git clone \<repo\_url>
🔁 13. Undo Changes (Very Important)
➤ Discard Working Changes
git restore <fileName>
➤ Unstage File
git restore --staged <fileName>
➤ Reset Commit (keep changes)
git reset --soft HEAD~~1
➤ Reset Completely (danger)
git reset --hard HEAD~~1
📦 14. Stashing (Temporary Save)
git stash
git stash pop
git stash list
🔍 15. Difference Between Changes
git diff
git diff --staged
🏷️ 16. Tags (Versioning)
git tag v1.0
git tag
git push origin v1.0
🧠 17. Important Concepts
Repository (Repo) → project tracked by Git
Commit → snapshot of code
Branch → parallel version of code
Merge → combine branches
HEAD → pointer to latest commit
Origin → remote repo (GitHub)
Main → default branch
Root Commit → first commit
⚡ 18. Best Practices
Commit frequently with clear messages
Use branches for features
Pull before push
Avoid --hard unless necessary
Resolve conflicts carefully
🧰 19. VS Code Tip
Install Git Autoconfig extension
If name/email incorrect → choose custom and re-enter
📝 20. Quick Start Flow
git init
git add .
git commit -m "first commit"
git branch -M main
git remote add origin \<repo\_url>
git push -u origin main


------------------------------------------------------------------------------------------------------
<!-- 8 April -->
# Advance Github:

1) How to move from Working area to Stagging Area
    -> git add fileName
    -> git add .    (for all files)

2) How to unstage files:
    -> git rm --cached fileName   (remove all commits and untrack the file)
    -> git rm --cached -r .       (remove all commits and untrack the file)

    -> git restored --staged fileName (better bcz it restore the last commit)
    _Difference_:  git restore --staged: undo a git add(keeps tracking the file); 
                   git rm --cached: stop tracking the file entirely(next commit will delete it from the repo, but keeps it on disk).

3) How to commit:
    -> git commit -m "commit msg"
    -> git commit -am "commit msg"
    -> git commit --amend -m "new-commit-msg"
    -> git commit --amend --no-edit
    -> git commit --allow-empty -m "your message"
    -> git commit -m "commit-msg" --author="name email
    -> git commit --allow-empty -m "Project Completed" --signoff

--------------------------------------------------------------------------------------
<!-- 9 april -->
4) How to ceaete branch:
  -> git branch branch_name
  -> git checkout -b branch_name
  ->** git switch -c branch_name

5) How to check no of branch:
  -> git branch

6) How to move from 1 branch to other
    -> git switch branch_name
    -> git checkout branch_name

7) How to delete a branch
    -> git branch -d branchName     (Normally)
    -> git branch -D branchName     (Forcefully)

8) How to merge branch:
    *Types of branch:* 
        1) Fast Forward Merge
        2) Three Way Merge
        3) Rebase Merge
        4) Interactive Rebase Merge
        5) Squashing Merge

    -> git merge branchName
    -> git 

    - when confict happens it shows 4 options: 
            1) accept current changes 
            2) accept incoming changes 
            3) accept both changes
            4) compare changes 

git reset --hard Head <steps>
git reset --soft 