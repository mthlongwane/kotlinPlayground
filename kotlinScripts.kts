import java.io.File

/*
 * Kotlin used for building scripts
 * Example code: 
 * kotlinc -script kotlinScripts.kts -- -d <path_to_folder_to_inspect>
 * 
 */
//

// Get the passed in path, i.e. "-d some/path" or use the current path.
val path = if (args.contains("-d")) args[1 + args.indexOf("-d")]
           else "."

val folders = File(path).listFiles { file -> file.isDirectory() }
folders?.forEach { folder -> println(folder) }