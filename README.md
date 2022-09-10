# LoaderDialog
An alternative to progress dialog

#Step 1. Add the JitPack repository to your build file
````
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
````

# Step 2. Add the dependency
````
dependencies {
    implementation 'com.github.prudhvikatlaparthi:LoaderApp:2.1.1'
}
````

# Step 3. Create instance
````
val loaderDialog: LoaderDialog = LoaderDialog(context = this)
````

# Step 4. Show Loader
````
loaderDialog.show()
````

# Step 5. Dismiss Loader
````
loaderDialog.dismiss()
````

☮️ Peace Happy Coding 😊
