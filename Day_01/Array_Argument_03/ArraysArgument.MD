# Understanding Java Parameter Passing

## Super-Simple Analogy Without Jargon

Imagine you have two things:

- **A single number** written on a piece of paper (that’s like your `nonChangable` value).  
- **A shared notebook** where you keep a list of scores (that’s like your `marks` array).

---

## 1. The Piece of Paper (Primitive `int`)

1. You write **5** on your original paper.  
2. You make a **photocopy** of it and hand the copy to someone else.  
3. They scribble **10** on their copy—but your **original** paper still says **5**.

> In Java, when you pass a plain number (primitive `int`) into a function, you’re really just handing over a photocopy. Changes on the copy don’t touch your original.

---

## 2. The Shared Notebook (Array `int[]`)

1. You have a notebook on the table with pages showing **97, 98, 99**.  
2. You give someone the **key** to open that same notebook.  
3. They flip to each page and add **1** to every score (making it **98, 99, 100**).  
4. Since it’s the **same notebook**, when they’re done, you look and see the updated scores.

> For arrays, Java hands over a copy of the key (the reference) to the same notebook. Because there’s only one notebook, edits inside the function show up for you too.

---

## 3. Why One Changes and the Other Doesn’t

| What You Pass In                | What Java Copies                  | Effect of Changing It Inside       | Visible to You Afterwards? |
|---------------------------------|-----------------------------------|------------------------------------|----------------------------|
| **A single number (`int`)**     | A **photocopy** of your number    | Only the photocopy changes         | No                         |
| **An array (`int[] marks`)**    | A **copy of the key** to notebook | The same notebook is edited        | Yes                        |

---

## The Bottom Line

- **Primitives** (numbers, true/false) → Java gives the function a **photocopy**.  
- **Arrays/Objects** (notebooks, lists) → Java gives the function a **copy of the key** to the same data.

> No matter what, Java always copies something when you call a function. For numbers, it’s the number itself; for lists or objects, it’s the key that opens the one shared notebook.
