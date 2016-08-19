package com.tangxiaolv.telegramgallery.TL;

public class TL_fileEncryptedLocation extends FileLocation {
	public static int constructor = 0x55555554;


		public void readParams(AbstractSerializedData stream, boolean exception) {
			dc_id = stream.readInt32(exception);
			volume_id = stream.readInt64(exception);
            local_id = stream.readInt32(exception);
            secret = stream.readInt64(exception);
			key = stream.readByteArray(exception);
			iv = stream.readByteArray(exception);
		}

		public void serializeToStream(AbstractSerializedData stream) {
            stream.writeInt32(constructor);
			stream.writeInt32(dc_id);
			stream.writeInt64(volume_id);
            stream.writeInt32(local_id);
            stream.writeInt64(secret);
			stream.writeByteArray(key);
			stream.writeByteArray(iv);
		}
	}