package com.github.wladox.model

/**
  * Created by wladox on 15.01.17.
  */
case class PositionReport(time:Int,
                          vid:Int,
                          speed:Int,
                          xWay:Int,
                          lane:Byte,
                          direction:Byte,
                          segment:Byte,
                          position:Int,
                          internalTime:Long,
                          isStopped:Boolean,
                          isCrossing:Boolean,
                          newMinute:Boolean,
                          lastLane:Byte,
                          lastPos:Int
                          ) {

  override def toString = s"$time.$vid.$speed.$position.$xWay.$lane.$direction.$segment"

  /*override def hashCode(): Int = {
    val prime = 31
    var result = 1
    result = prime * result + age;
    result = prime * result + (if (name == null) 0 else name.hashCode)
    return result
  }


  override def equals(obj: scala.Any): Boolean =
    obj match {
      case obj:PositionReport => obj.isInstanceOf[PositionReport] && this.hashCode() == obj.hashCode()
      case _ => false
    }*/
}
