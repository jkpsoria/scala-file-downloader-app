package models

import scala.collection.mutable.ListBuffer
import java.util.UUID



case class FileModel(id: UUID, fileName: String, password: String)

object FileModel{
    val file: ListBuffer[FileModel] = ListBuffer()

    def uploadFile(newFile: FileModel) = file += newFile
    
    def findByID(id: UUID) = file.find(_.id == id)


}