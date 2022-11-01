# Status

Currently trying to set up all the java leetcode questions in a compilable maven project but still need to configure some things for it to build.

[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.1:compile (default-compile) on project leetcode-java: Compilation failure: Compilation failure: 
[ERROR] Source option 5 is no longer supported. Use 7 or later.
[ERROR] Target option 5 is no longer supported. Use 7 or later.
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
    
### Command used to generate this project
    
    mvn archetype:generate -DgroupId=julia.immer -DartifactId=leetcode-java  -DinteractiveMode=false