# Cognizant-GenC-PrepInsta

A curated collection of coding problems, solutions, notes, and resources prepared for Cognizant GenC interviews and PrepInsta practice. This repository is organized to help you practice problem-solving, data structures, algorithms, and Java-based project examples.

---

## Table of Contents

- [About](#about)
- [Features](#features)
- [Repository Structure](#repository-structure)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Clone the repository](#clone-the-repository)
  - [How to run Java solutions](#how-to-run-java-solutions)
- [How to Contribute](#how-to-contribute)
- [Best Practices for Adding Problems](#best-practices-for-adding-problems)
- [License](#license)
- [Contact](#contact)
- [Acknowledgements & Resources](#acknowledgements--resources)

---

## About

This repository is intended to be a practical study hub for candidates preparing for Cognizant GenC and related technical interviews. It organizes problems by topic, provides working Java solutions, and collects notes and references to common interview patterns.

---

## Features

- Structured problem folders (e.g., arrays, strings, linked-lists, DP)
- Clean, well-documented Java solutions
- Example inputs/outputs and complexity analysis
- Notes and cheat-sheets for common topics
- Contribution guidelines to keep content consistent

---

## Repository Structure

A suggested structure — adapt as needed:

- `/arrays/` - array problems and solutions
- `/strings/` - string manipulation questions
- `/linkedlists/` - linked-list problems
- `/trees/` - tree and graph problems
- `/dynamic-programming/` - DP problems
- `/java-projects/` - small Java projects or templates (Maven/Gradle)
- `/notes/` - study notes and summaries
- `/resources/` - links to articles, videos, and PrepInsta guides
- `README.md` - this file

If your repo has a different structure, update this section accordingly.

---

## Getting Started

### Prerequisites

- Java JDK 11+ (or the version you prefer)
- Optional: Maven or Gradle if projects use them
- Git for cloning

### Clone the repository

```bash
git clone https://github.com/Chandrasish-Bhattacharya/Cognizant-GenC-PrepInsta.git
cd Cognizant-GenC-PrepInsta
```

### How to run Java solutions

If the solution is a single-file Java program:

```bash
# compile
javac Path/To/Solution.java

# run
java Path.To.Solution    # or: java Solution (depending on package)
```

If the project uses Maven:

```bash
mvn compile
mvn exec:java -Dexec.mainClass="com.your.MainClass"
```

If the project uses Gradle:

```bash
./gradlew build
./gradlew run
```

Include input files or instructions in each problem folder so others can run examples easily.

---

## How to Contribute

Contributions are welcome! To keep the repository consistent, please:

1. Fork the repository and create a feature branch: `git checkout -b feature/<topic>-<short-desc>`
2. Add your problem in a new folder or the appropriate topic folder.
3. Follow the naming convention:
   - Problem file: `ProblemName.java`
   - README for each problem: `ProblemName/README.md` with:
     - Problem statement
     - Example input/output
     - Complexity analysis
     - How to run
4. Add tests or example input files where applicable.
5. Submit a pull request with a clear title and description.

---

## Best Practices for Adding Problems

- Provide a short problem statement at the top of each solution file or in a problem-specific README.
- Add time and space complexity comments.
- Prefer clear variable names and modular functions.
- Keep each solution focused — one main class or folder per problem.

---

## License

This repository is currently unlicensed. If you'd like it to be open source, consider adding an MIT License:

```
MIT License
[...license text...]
```

Add a `LICENSE` file to the repository to make licensing explicit.

---

## Contact

Maintainer: [Chandrasish-Bhattacharya](https://github.com/Chandrasish-Bhattacharya)

If you'd like, I can:
- Commit this README directly to your repository,
- Add a `CONTRIBUTING.md` template,
- Or scaffold the suggested folder structure with example files.

---

## Acknowledgements & Resources

- PrepInsta: https://prepinsta.com
- LeetCode / GeeksforGeeks / HackerRank
- Useful reading: "Cracking the Coding Interview" by Gayle Laakmann McDowell

---

Happy coding — build small, test often, and document your solutions for future review!