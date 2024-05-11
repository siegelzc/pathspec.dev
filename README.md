# Pathspec.dev



## Set up the environment

Before starting, ensure you have the necessary IDE and browser setup to run the application.

### IDE

We recommend using [IntelliJ IDEA 2023.1 or later](https://www.jetbrains.com/idea/) to work with the project.
It supports Kotlin/Wasm out of the box.

### Browser (for Kotlin/Wasm target)

To run Kotlin/Wasm applications in a browser, you need a browser supporting the [Wasm Garbage Collection (GC) feature](https://github.com/WebAssembly/gc):

**Chrome and Chromium-based**

* **For version 119 or later:**

  Works by default.

**Firefox**

* **For version 120 or later:**

  Works by default.

**Safari/WebKit**

Wasm GC support is currently under
[active development](https://bugs.webkit.org/show_bug.cgi?id=247394).

> **Note:**
> For more information about the browser versions, see the [Troubleshooting documentation](https://kotl.in/wasm_help/).

## Build and run

To build and run the application:

1. In IntelliJ IDEA, open the repository.
2. Navigate to the `browser-example` project folder.
3. Run the application by typing the following Gradle command in the terminal:

   `./gradlew wasmJsBrowserRun -t`
   <br>&nbsp;<br>

Once the application starts, open the following URL in your browser:

`http://localhost:8080`

> **Note:**
> The port number can vary. If the port 8080 is unavailable, you can find the corresponding port number printed in the console
> after building the application.

<details>
<summary>From the Git glossary</summary>
<pre>
[[def_pathspec]]pathspec::
Pattern used to limit paths in Git commands.
+
Pathspecs are used on the command line of "git ls-files", "git
ls-tree", "git add", "git grep", "git diff", "git checkout",
and many other commands to
limit the scope of operations to some subset of the tree or
working tree.  See the documentation of each command for whether
paths are relative to the current directory or toplevel.  The
pathspec syntax is as follows:
+
--

* any path matches itself
* the pathspec up to the last slash represents a
  directory prefix.  The scope of that pathspec is
  limited to that subtree.
* the rest of the pathspec is a pattern for the remainder
  of the pathname.  Paths relative to the directory
  prefix will be matched against that pattern using fnmatch(3);
  in particular, '*' and '?' _can_ match directory separators.

--
+
For example, Documentation/*.jpg will match all .jpg files
in the Documentation subtree,
including Documentation/chapter_1/figure_1.jpg.
+
A pathspec that begins with a colon `:` has special meaning.  In the
short form, the leading colon `:` is followed by zero or more "magic
signature" letters (which optionally is terminated by another colon `:`),
and the remainder is the pattern to match against the path.
The "magic signature" consists of ASCII symbols that are neither
alphanumeric, glob, regex special characters nor colon.
The optional colon that terminates the "magic signature" can be
omitted if the pattern begins with a character that does not belong to
"magic signature" symbol set and is not a colon.
+
In the long form, the leading colon `:` is followed by an open
parenthesis `(`, a comma-separated list of zero or more "magic words",
and a close parentheses `)`, and the remainder is the pattern to match
against the path.
+
A pathspec with only a colon means "there is no pathspec". This form
should not be combined with other pathspec.
+
--
top;;
The magic word `top` (magic signature: `/`) makes the pattern
match from the root of the working tree, even when you are
running the command from inside a subdirectory.

literal;;
Wildcards in the pattern such as `*` or `?` are treated
as literal characters.

icase;;
Case insensitive match.

glob;;
Git treats the pattern as a shell glob suitable for
consumption by fnmatch(3) with the FNM_PATHNAME flag:
wildcards in the pattern will not match a / in the pathname.
For example, "Documentation/{asterisk}.html" matches
"Documentation/git.html" but not "Documentation/ppc/ppc.html"
or "tools/perf/Documentation/perf.html".
+
Two consecutive asterisks ("`**`") in patterns matched against
full pathname may have special meaning:

- A leading "`**`" followed by a slash means match in all
  directories. For example, "`**/foo`" matches file or directory
  "`foo`" anywhere, the same as pattern "`foo`". "`**/foo/bar`"
  matches file or directory "`bar`" anywhere that is directly
  under directory "`foo`".

- A trailing "`/**`" matches everything inside. For example,
  "`abc/**`" matches all files inside directory "abc", relative
  to the location of the `.gitignore` file, with infinite depth.

- A slash followed by two consecutive asterisks then a slash
  matches zero or more directories. For example, "`a/**/b`"
  matches "`a/b`", "`a/x/b`", "`a/x/y/b`" and so on.

- Other consecutive asterisks are considered invalid.
+
Glob magic is incompatible with literal magic.

attr;;
After `attr:` comes a space separated list of "attribute
requirements", all of which must be met in order for the
path to be considered a match; this is in addition to the
usual non-magic pathspec pattern matching.
See linkgit:gitattributes[5].
+
Each of the attribute requirements for the path takes one of
these forms:

- "`ATTR`" requires that the attribute `ATTR` be set.

- "`-ATTR`" requires that the attribute `ATTR` be unset.

- "`ATTR=VALUE`" requires that the attribute `ATTR` be
  set to the string `VALUE`.

- "`!ATTR`" requires that the attribute `ATTR` be
  unspecified.
+
Note that when matching against a tree object, attributes are still
obtained from working tree, not from the given tree object.

exclude;;
After a path matches any non-exclude pathspec, it will be run
through all exclude pathspecs (magic signature: `!` or its
synonym `^`). If it matches, the path is ignored.  When there
is no non-exclude pathspec, the exclusion is applied to the
result set as if invoked without any pathspec.
--
</pre>
</details>