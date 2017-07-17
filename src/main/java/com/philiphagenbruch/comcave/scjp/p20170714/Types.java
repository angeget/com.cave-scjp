package com.philiphagenbruch.comcave.scjp.p20170714;

/**
 * <p>
 * A list of all basic Java types.
 * </p>
 * <p>
 * Those which don't have <tt>null</tt> as their default value are called <b>primitive types</b> A variable of a
 * primitive type doesn't carry a <i>reference</i> like most Java variables, but a value. If such a variable is then
 * used as an argument in a method or constructor, it also being passed <i>by value, not by reference</i>.
 * </p>
 * <p>
 * <i>String</i> is a special case. It's being treated similar to a primitive type in code but is always being passed by
 * reference, because String extends <tt>Object</tt>. Strings are immutable. Once initialized, they can no longer be
 * modified. Primitive types can be <i>boxed</i> into a immutable complex type representation.
 * </p>
 *
 * @since 0.1.0
 */
public enum Types {

    /**
     * True/false value. Size depends on JVM implementation.
     */
    BOOLEAN(false, Boolean.class),

    /**
     * 1 byte long signed number.
     */
    BYTE(0x00, Byte.class),

    /**
     * 2 byte long unsigned number representing a character.
     */
    CHAR((char) 0, Character.class),

    /**
     * 2 byte long signed number.
     */
    SHORT((short) 0, Short.class),

    /**
     * 4 byte long signed number.
     */
    INT(0, Integer.class),

    /**
     * 4 byte long signed floating point number.
     */
    FLOAT(0.0f, Float.class),

    /**
     * 8 byte long signed number.
     */
    LONG(0L, Long.class),

    /**
     * 8 byte long signed floating point number.
     */
    DOUBLE(0.0D, Double.class),

    /**
     * A character sequence of variable length.
     */
    STRING(null, String.class),

    /**
     * A complex type.
     */
    OBJECT(null, Object.class)

    ;

    private final Object defaultValue;
    private final Class<?> boxingType;

    private Types(final Object defaultValue, final Class<?> boxingType) {
        this.boxingType = boxingType;
        this.defaultValue = defaultValue;
    }

    /**
     * <p>
     * Returns the boxing type.
     * </p>
     *
     * @since 0.1.0
     * @return the boxing type
     */
    public Class<?> getBoxingType() {
        return boxingType;
    }

    /**
     * <p>
     * Returns the default value, when not initialized during declaration.
     * </p>
     *
     * @since 0.1.0
     * @return the default value
     */
    public Object getDefaultValue() {
        return defaultValue;
    }
}
