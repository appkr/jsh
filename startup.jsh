import java.time.*;
import java.time.format.*;
import java.text.*;
import java.security.*;
import org.apache.commons.lang3.*;
import org.apache.commons.io.*;
import org.apache.commons.codec.*;
import org.apache.commons.codec.binary.*;
import org.apache.commons.codec.digest.*;
import com.google.common.base.*;
import com.google.common.collect.*;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.type.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

var mapper = new ObjectMapper();
mapper.registerModule(new JavaTimeModule());
mapper.disable(
        DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
        DeserializationFeature.READ_DATE_TIMESTAMPS_AS_NANOSECONDS);
    mapper.disable(SerializationFeature.WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS,
        SerializationFeature.WRITE_DATES_AS_TIMESTAMPS,
        SerializationFeature.FAIL_ON_EMPTY_BEANS);
