def openFile(fileName){
	new FileInputStream(fileName)
}





try{
	openFile("nonexistenfile")
//}catch(FileNotFoundException ex){
}catch (ex){
	// Do whatever you like about this exception here
	println "Oops: " + ex
}