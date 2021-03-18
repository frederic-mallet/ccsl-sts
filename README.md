# ccsl-sts
Compilation of Light-CCSL into Synchronized Transition Systems 

## Deploying Light-CCSL into Eclipse
1. Install Eclipse, be sure to use the [Modeling Package](https://www.eclipse.org/downloads/packages/release/2020-09/r/eclipse-modeling-tools)
2. Launch Eclipse and install XText
  - Menu Help/Install New Software...
  - Select all available repositories
  - Use filter to type XText
  - Install all the plugins and restart
3. from the command line, unzip the [lightccsl-feature.zip](dependencies/lightccsl-feature.zip) into the dropins folder of your Eclipse installation directory.
  - Be sure to keep the features and dropins folder (and their content) and remove expanded .xml files
4. Restart Eclipse

## Create a .lc file
1. Launch Eclipse where Light-CCSL has been deployed
2. Create an empty project (Better to generate a Java Project for what follows)
3. Create a file with extension .lc (or you can use the Wizard to create an empty file)
4. Open this .lc file, it should trigger the .lc editor
5. Type Ctrl-space any time you do not know the content

## Using the generated code
Every time you edit and save the .lc files, a Java file is generated in the src-gen folder
1. Transform your project into a Java project if not already like that
2. add src-gen as a source folder
3. add the required libraries depending on the features you are using (see [dependencies/jar](dependencies/jar)
4. run the generated .java file to execute. the minimum is to print out again the source specification

## Options
There are lots code generation options available. See Windows/Preferences and select the Light-ccsl tab to see the specific options
