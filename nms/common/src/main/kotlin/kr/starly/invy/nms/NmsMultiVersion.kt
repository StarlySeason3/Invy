package kr.starly.invy.nms

import kr.starly.invy.nms.version.NmsRevision

class NmsMultiVersion {

    companion object {

        private val NMS_REVISION = NmsRevision.REQUIRED_REVISION

        @Suppress("UNCHECKED_CAST")
        private fun <T> getImplClass(className: String): Class<T> {
            return Class.forName("kr.starly.invy.nms." + NMS_REVISION.name + "." + className + "Impl") as Class<T>
        }

        @Suppress("UNCHECKED_CAST")
        private fun <T> getImplInstance(clazz: Class<T>): T {
            return clazz.getConstructor().newInstance() as T
        }

    }

}