import subprocess

try:
    dir_name = input("dir: ")
    file_name = input("file name (without .java extension): ")

    # Compile the Java file
    compile_result = subprocess.run(["javac", f"{dir_name}/{file_name}.java"], stderr=subprocess.PIPE, stdout=subprocess.PIPE, text=True, check=True)

    # Run the compiled Java program
    run_result = subprocess.run(["java", "-cp", dir_name, file_name], stderr=subprocess.PIPE, stdout=subprocess.PIPE, text=True, check=True)

    print("Java Output:")
    print(run_result.stdout)

except subprocess.CalledProcessError as e:
    print("Error:", e)
    print("Compilation Output:")
    print(e.stdout)
    print("Compilation Errors:")
    print(e.stderr)

except Exception as ex:
    print("An unexpected error occurred:", ex)
