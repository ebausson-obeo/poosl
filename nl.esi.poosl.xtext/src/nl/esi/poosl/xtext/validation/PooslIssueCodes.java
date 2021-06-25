package nl.esi.poosl.xtext.validation;

public final class PooslIssueCodes {
    // Misc
    public static final String LOCATION_OF_RETURN_MISSING = "LOCATION_OF_RETURN_MISSING";

    public static final String LOCATION_OF_RETURN_SUPERFLUOUS = "LOCATION_OF_RETURN_SUPERFLUOUS";

    public static final String EQUALITY_INSTEAD_OF_ASSIGNMENT = "EQUALITY_INSTEAD_OF_ASSIGNMENT";

    public static final String MISSING_INSTANCE_PARAMETER = "MISSING_INSTANCE_PARAMETER";

    public static final String MULTIPLE_CHANNELS_CONNECTED_TO_INSTANCE_PORT = "MULTIPLE_CHANNELS_CONNECTED_TO_INSTANCE_PORT";

    public static final String MULTIPLE_CHANNELS_CONNECTED_TO_EXTERNAL_PORT = "MULTIPLE_CHANNELS_CONNECTED_TO_EXTERNAL_PORT";

    public static final String UNCONNECTED = "UNCONNECTED";

    public static final String UNCONNECTED_EXTERNAL_PORT = "UNCONNECTED_EXTERNAL_PORT";

    public static final String UNCONNECTED_CHANNEL = "UNCONNECTED_CHANNEL";

    public static final String INVALID_IMPORT_VALID_IMPORTLIB = "INVALID_IMPORT_VALID_IMPORTLIB";

    public static final String INVALID_IMPORTLIB_VALID_IMPORT = "INVALID_IMPORTLIB_VALID_IMPORT";

    public static final String UNCONNECTED_INTERNAL_CHANNEL = "UNCONNECTED_INTERNAL_CHANNEL";

    public static final String INIT_CALL_MISSING = "INIT_CALL_MISSING";

    // Types
    public static final String TYPECHECK = "TYPECHECK";

    public static final String MISSING_MESSAGE_DECLARATION = "MISSING_MESSAGE_DECLARATION";

    public static final String INVALID_TYPES_RECEIVE_STATEMENT = "INVALID_TYPES_RECEIVE_STATEMENT";

    public static final String INVALID_TYPES_SEND_STATEMENT = "INVALID_TYPES_SEND_STATEMENT";

    public static final String INVALID_INPUT_TYPES_PROCESS_METHOD_CALL = "INVALID_INPUT_TYPES_PROCESS_METHOD_CALL";

    public static final String INVALID_OUTPUT_TYPES_PROCESS_METHOD_CALL = "INVALID_OUTPUT_TYPES_PROCESS_METHOD_CALL";

    public static final String INVALID_INSTANCE_PARAMETER_TYPE = "INVALID_INSTANCE_PARAMETER_TYPE";

    public static final String INVALID_RETURN_TYPE = "INVALID_RETURN_TYPE";

    public static final String INVALID_OVERRIDE_RETURN_TYPE = "INVALID_OVERRIDE_RETURN_TYPE";

    public static final String INVALID_OVERRIDE_PARAMETER_TYPE = "INVALID_OVERRIDE_PARAMETER_TYPE";

    public static final String INVALID_OVERRIDE_INPUT_PARAMETER_TYPE = "INVALID_OVERRIDE_INPUT_PARAMETER_TYPE";

    public static final String INVALID_OVERRIDE_OUTPUT_PARAMETER_TYPE = "INVALID_OVERRIDE_OUTPUT_PARAMETER_TYPE";

    public static final String INVALID_ASSIGNMENT_TYPE = "INVALID_ASSIGNMENT_TYPE";

    public static final String INCOMPATIBLE_TYPE = "INCOMPATIBLE_TYPE";

    // Unique Names
    public static final String DUPLICATE_CLASS_NAME = "DUPLICATE_CLASS_NAME";

    public static final String DUPLICATE_METHOD_NAME = "DUPLICATE_METHOD_NAME";

    // Unused elements
    public static final String UNUSED_PROCESS_PORT = "UNUSED_PROCESS_PORT";

    public static final String ERROR_UNUSED_CHANNEL = "UNUSED_CHANNEL";

    public static final String WARNING_UNUSED_CHANNEL = "WARNING_UNUSED_CHANNEL";

    public static final String UNUSED_MESSAGE_SIGNATURE = "UNUSED_MESSAGE_SIGNATURE";

    public static final String UNUSED_PROCESS_METHOD = "UNUSED_PROCESS_METHOD";

    public static final String UNUSED_VARIABLE = "UNUSED_VARIABLE";

    // Unresolved
    public static final String UNDECLARED_DATA_METHOD_NAMED = "UNDECLARED_DATA_METHOD_NAMED";

    public static final String UNDECLARED_DATA_METHOD_BINARY = "UNDECLARED_DATA_METHOD_BINARY";

    public static final String UNDECLARED_DATA_METHOD_UNARY = "UNDECLARED_DATA_METHOD_UNARY";

    // Grammar
    public static final String UNKNOWN_ANNOTATION = "UNKNOWN_ANNOTATION";

    private PooslIssueCodes() {
        throw new IllegalStateException("Utility class");
    }
}
