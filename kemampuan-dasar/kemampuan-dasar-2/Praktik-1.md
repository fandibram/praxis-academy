# 1. Alice membuat proyek baru
membuat repository lokal, readme, dan commit

    bram@bram-pc:~$ mkdir rhymes
    bram@bram-pc:~$ cd rhymes
    bram@bram-pc:~/rhymes$ git init
    Initialized empty Git repository in /home/bram/rhymes/.git/
    bram@bram-pc:~/rhymes$ touch README.txt
    bram@bram-pc:~/rhymes$ git add README.txt
    bram@bram-pc:~/rhymes$ git commit -m 'First commit.'
    [master (root-commit) b7bb444] First commit.
    1 file changed, 0 insertions(+), 0 deletions(-)
    create mode 100644 README.txt
    bram@bram-pc:~/rhymes$ echo 'this repo is a collection of my favorite nursery rhymes.' >> README.txt

cek perubahan yang terjadi (Edit, Hapus, create)

    bram@bram-pc:~/rhymes$ git status
    On branch master
    Changes not staged for commit:
    (use "git add <file>..." to update what will be committed)
    (use "git checkout -- <file>..." to discard changes in working directory)

	    modified:   README.txt

    no changes added to commit (use "git add" and/or "git commit -a")
    bram@bram-pc:~/rhymes$ git diff
    diff --git a/README.txt b/README.txt
    index e69de29..56dacca 100644
    --- a/README.txt
    +++ b/README.txt
    @@ -0,0 +1 @@
    +this repo is a collection of my favorite nursery rhymes.
    bram@bram-pc:~/rhymes$ git add README.txt
    bram@bram-pc:~/rhymes$ git commit -m 'added project overview to README.txt'
    [master a5e1a2e] added project overview to README.txt
    1 file changed, 1 insertion(+)

menambahkan file baru

    bram@bram-pc:~/rhymes$ git add .
    bram@bram-pc:~/rhymes$ git commit -m 'rhymes'
    [master f35eb52] rhymes
    5 files changed, 87 insertions(+)
     create mode 100644 all-around-the-mulberry-bush.txt
     create mode 100644 hokey-pokey.txt
     create mode 100644 jack-and-jill.txt
     create mode 100644 old-mother-hubbard.txt
     create mode 100644 twinkle-twinkle.txt

Push file

    bram@bram-pc:~/rhymes$ git remote add origin https://github.com/fandibram/rhymes.git
    bram@bram-pc:~/rhymes$ git push -u origin master
    Username for 'https://github.com': fandibram
    Password for 'https://fandibram@github.com': 
    Counting objects: 13, done.
    Delta compression using up to 4 threads.
    Compressing objects: 100% (10/10), done.
    Writing objects: 100% (13/13), 1.83 KiB | 937.00 KiB/s, done.
    Total 13 (delta 0), reused 0 (delta 0)
    To https://github.com/fandibram/rhymes.git
    * [new branch]      master -> master
    Branch 'master' set up to track remote branch 'master' from 'origin'.
bram@bram-pc:~/rhymes$ git remote add origin https://github.com/fandibram/rhymes.git
bram@bram-pc:~/rhymes$ git push -u origin master
Username for 'https://github.com': fandibram
Password for 'https://fandibram@github.com': 
Counting objects: 13, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (10/10), done.
Writing objects: 100% (13/13), 1.83 KiB | 937.00 KiB/s, done.
Total 13 (delta 0), reused 0 (delta 0)
To https://github.com/fandibram/rhymes.git
 * [new branch]      master -> master
Branch 'master' set up to track remote branch 'master' from 'origin'.

# 2. Bob menyalin proyek Alice dan menambahkan beberapa perubahan sederhana

    bram@bram-pc:~$ cd bob
    bram@bram-pc:~/bob$ git clone https://github.com/fandibram/rhymes.git
    Cloning into 'rhymes'...
    remote: Enumerating objects: 13, done.
    remote: Counting objects: 100% (13/13), done.
    remote: Compressing objects: 100% (10/10), done.
    remote: Total 13 (delta 0), reused 13 (delta 0), pack-reused 0
    Unpacking objects: 100% (13/13), done.
    bram@bram-pc:~/bob$ cd rhymes
    bram@bram-pc:~/bob/rhymes$ git checkout -b hickory-dickory
    Switched to a new branch 'hickory-dickory'
    bram@bram-pc:~/bob/rhymes$ git add hickory-dickory-dock.txt
    bram@bram-pc:~/bob/rhymes$ git commit -m 'added hickory-dickory-dock.txt'
    [hickory-dickory 2dd5c0d] added hickory-dickory-dock.txt
    1 file changed, 5 insertions(+)
    create mode 100644 hickory-dickory-dock.txt
    bram@bram-pc:~/bob/rhymes$ 
    bram@bram-pc:~/bob/rhymes$ git push origin hickory-dickory
    Username for 'https://github.com': fandibram
    Password for 'https://fandibram@github.com': 
    Counting objects: 3, done.
    Delta compression using up to 4 threads.
    Compressing objects: 100% (3/3), done.
    Writing objects: 100% (3/3), 348 bytes | 348.00 KiB/s, done.
    Total 3 (delta 1), reused 0 (delta 0)
    remote: Resolving deltas: 100% (1/1), completed with 1 local object.
    remote: 
    remote: Create a pull request for 'hickory-dickory' on GitHub by visiting:
    remote:      https://github.com/fandibram/rhymes/pull/new/hickory-dickory
    remote: 
    To https://github.com/fandibram/rhymes.git
    * [new branch]      hickory-dickory -> hickory-dickory

# 3. Alice menerima perubahan sederhana dari Bob

    bram@bram-pc:~/rhymes$ git remote rename origin alice
    bram@bram-pc:~/rhymes$ git remote add bob https://github.com/fandibram/rhymes.git
    bram@bram-pc:~/rhymes$ git remote
    alice
    bob
    bram@bram-pc:~/rhymes$ git remote -v
    alice	https://github.com/fandibram/rhymes.git (fetch)
    alice	https://github.com/fandibram/rhymes.git (push)
    bob	https://github.com/fandibram/rhymes.git (fetch)
    bob	https://github.com/fandibram/rhymes.git (push)
    bram@bram-pc:~/rhymes$ git fetch bob
    git branchremote: Enumerating objects: 4, done.
    remote: Counting objects: 100% (4/4), done.
    remote: Compressing objects: 100% (2/2), done.
    remote: Total 3 (delta 1), reused 3 (delta 1), pack-reused 0
    Unpacking objects: 100% (3/3), done.
    From https://github.com/fandibram/rhymes
    * [new branch]      hickory-dickory -> bob/hickory-dickory
    * [new branch]      master          -> bob/master
    bram@bram-pc:~/rhymes$ git branch -a
    * master
    remotes/alice/master
    remotes/bob/hickory-dickory
    remotes/bob/master

tinjau karya bob

    bram@bram-pc:~/rhymes$ git checkout -b hickory-dickory bob/hickory-dickory
    Branch 'hickory-dickory' set up to track remote branch 'hickory-dickory' from 'bob'.
    Switched to a new branch 'hickory-dickory'
    bram@bram-pc:~/rhymes$ git diff master hickory-dickory
    diff --git a/hickory-dickory-dock.txt b/hickory-dickory-dock.txt
    new file mode 100644
    index 0000000..f127659
    --- /dev/null
    +++ b/hickory-dickory-dock.txt
    @@ -0,0 +1,5 @@
    +Hickory, dickory, dock.
    +The mouse ran up the clock.
    +The clock struck one,
    +The mouse ran down,
    +Hickory, dickory, dock.
    bram@bram-pc:~/rhymes$ git log -1 -p
    commit 2dd5c0d1cfb2c695f38cb958bc849d91de85881a (HEAD -> hickory-dickory, bob/hickory-dickory)
    Author: fandibram <fandibramanto@rocketmail.com>
    Date:   Sun Dec 29 18:08:41 2019 +0700

        added hickory-dickory-dock.txt

    diff --git a/hickory-dickory-dock.txt b/hickory-dickory-dock.txt
    new file mode 100644
    index 0000000..f127659
    --- /dev/null
    +++ b/hickory-dickory-dock.txt
    @@ -0,0 +1,5 @@
    +Hickory, dickory, dock.
    +The mouse ran up the clock.
    +The clock struck one,
    +The mouse ran down,
    +Hickory, dickory, dock.
    bram@bram-pc:~/rhymes$ git checkout master
    Switched to branch 'master'
    Your branch is up to date with 'alice/master'.
    bram@bram-pc:~/rhymes$ git merge hickory-dickory
    Updating f35eb52..2dd5c0d
    Fast-forward
    hickory-dickory-dock.txt | 5 +++++
    1 file changed, 5 insertions(+)
    create mode 100644 hickory-dickory-dock.txt
    bram@bram-pc:~/rhymes$ git branch -D hickory-dickory
    Deleted branch hickory-dickory (was 2dd5c0d).

# 4. Bob menambah banyak perubahan

    bram@bram-pc:~/bob/rhymes$ git remote rename origin bob
    bram@bram-pc:~/bob/rhymes$ git remote add alice https://github.com/fandibram/rhymes.git
    bram@bram-pc:~/bob/rhymes$ git remote
    alice
    bob
    bram@bram-pc:~/bob/rhymes$ git remote -v
    alice	https://github.com/fandibram/rhymes.git (fetch)
    alice	https://github.com/fandibram/rhymes.git (push)
    bob	https://github.com/fandibram/rhymes.git (fetch)
    bob	https://github.com/fandibram/rhymes.git (push)
    bram@bram-pc:~/bob/rhymes$ git remote update
    Fetching bob
    Fetching alice
    From https://github.com/fandibram/rhymes
    * [new branch]      hickory-dickory -> alice/hickory-dickory
    * [new branch]      master          -> alice/master
    bram@bram-pc:~/bob/rhymes$ git checkout master
    Switched to branch 'master'
    Your branch is up to date with 'bob/master'.
    bram@bram-pc:~/bob/rhymes$ git merge alice master
    merge: alice - not something we can merge
    bram@bram-pc:~/bob/rhymes$ git diff alice/master
    bram@bram-pc:~/bob/rhymes$ git push bob master
    Username for 'https://github.com': fandibram
    Password for 'https://fandibram@github.com': 
    Everything up-to-date
    bram@bram-pc:~/bob/rhymes$ git checkout -b bobs-changes
    Switched to a new branch 'bobs-changes'
    bram@bram-pc:~/bob/rhymes$ git add jack-be-nimble.txt
    bram@bram-pc:~/bob/rhymes$ git commit -m 'added jack-be-nimble.txt.'
    [bobs-changes a06497f] added jack-be-nimble.txt.
    1 file changed, 4 insertions(+)
    create mode 100644 jack-be-nimble.txt
    bram@bram-pc:~/bob/rhymes$ git add mother-goose.txt
    bram@bram-pc:~/bob/rhymes$ git commit -m 'add mother-goose.txt.'
    [bobs-changes 238573b] add mother-goose.txt.
    1 file changed, 4 insertions(+)
    create mode 100644 mother-goose.txt
    bram@bram-pc:~/bob/rhymes$ git commit -am 'Updated README.txt.'
    On branch bobs-changes
    nothing to commit, working tree clean
    bram@bram-pc:~/bob/rhymes$ git commit -am 'Fixed typo in README.txt'
    On branch bobs-changes
    nothing to commit, working tree clean

