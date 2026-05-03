package utility;

import javafx.beans.binding.Bindings;
import javafx.beans.binding.NumberBinding;
import javafx.scene.Node;
import javafx.scene.layout.Region;

public class DynamicFontScaler
{
    private static final double HERO_DIVISOR     = 12;
    private static final double HERO_MIN_SIZE    = 24;
    private static final double HERO_MAX_SIZE    = 80;

    private static final double TITLE_DIVISOR    = 20;
    private static final double TITLE_MIN_SIZE   = 18;
    private static final double TITLE_MAX_SIZE   = 48;

    private static final double HEADER_DIVISOR   = 25;
    private static final double HEADER_MIN_SIZE  = 16;
    private static final double HEADER_MAX_SIZE  = 42;

    private static final double SECTION_DIVISOR  = 30;
    private static final double SECTION_MIN_SIZE = 16;
    private static final double SECTION_MAX_SIZE = 36;

    private static final double SUBHEAD_DIVISOR  = 40;
    private static final double SUBHEAD_MIN_SIZE = 14;
    private static final double SUBHEAD_MAX_SIZE = 28;

    private static final double BODY_DIVISOR     = 60;
    private static final double BODY_MIN_SIZE    = 12;
    private static final double BODY_MAX_SIZE    = 18;

    private static final double CAPTION_DIVISOR  = 80;
    private static final double CAPTION_MIN_SIZE = 10;
    private static final double CAPTION_MAX_SIZE = 14;

    private static final double FOOTER_DIVISOR   = 100;
    private static final double FOOTER_MIN_SIZE  = 9;
    private static final double FOOTER_MAX_SIZE  = 12;

    public static void applyScalableText(final Node node,
                                         final Region root,
                                         final double divisor,
                                         final double min,
                                         final double max)
    {
        final NumberBinding fontSize;

        fontSize = Bindings.max(min, Bindings.min(max, root.widthProperty().divide(divisor)));

        node.styleProperty().bind(Bindings.concat("-fx-font-size: ", fontSize.asString(), "px;"));
    }

    public static void applyScalableText(final Node node,
                                         final Region root,
                                         final double divisor,
                                         final double min)
    {
        final NumberBinding fontSize;

        fontSize = Bindings.max(min, root.widthProperty().divide(divisor));

        node.styleProperty().bind(Bindings.concat("-fx-font-size: ", fontSize.asString(), "px;"));
    }

    public static void applyScalableText(final Node node,
                                         final Region root,
                                         final double divisor)
    {
        final NumberBinding fontSize;

        fontSize = root.widthProperty().divide(divisor);

        node.styleProperty().bind(Bindings.concat("-fx-font-size: ", fontSize.asString(), "px;"));
    }

    /**
     * Applies hero-level dynamic font scaling to a node, scaled relative to the
     * root region. Hero text is the largest scale, intended for splash screens
     * and major headers.
     *
     * @param node    the node whose font size will scale
     * @param root    the root region whose width drives the scaling
     * @param clamp   if true, font size is bounded between HERO_MIN_SIZE and HERO_MAX_SIZE
     * @param minOnly if true, font size has a floor of HERO_MIN_SIZE but no ceiling; ignored if clamp is true
     */
    public static void applyHeroScaling(final Node node, final Region root, final boolean clamp, final boolean minOnly)
    {
        if (clamp) {
            applyScalableText(node, root, HERO_DIVISOR, HERO_MIN_SIZE, HERO_MAX_SIZE);
        } else if (minOnly) {
            applyScalableText(node, root, HERO_DIVISOR, HERO_MIN_SIZE);
        } else {
            applyScalableText(node, root, HERO_DIVISOR);
        }
    }

    /**
     * Applies title-level dynamic font scaling to a node, scaled relative to
     * the root region. Title text is intended for main window titles and page
     * headers.
     *
     * @param node    the node whose font size will scale
     * @param root    the root region whose width drives the scaling
     * @param clamp   if true, font size is bounded between TITLE_MIN_SIZE and TITLE_MAX_SIZE
     * @param minOnly if true, font size has a floor of TITLE_MIN_SIZE but no ceiling; ignored if clamp is true
     */
    public static void applyTitleScaling(final Node node, final Region root, final boolean clamp, final boolean minOnly)
    {
        if (clamp) {
            applyScalableText(node, root, TITLE_DIVISOR, TITLE_MIN_SIZE, TITLE_MAX_SIZE);
        } else if (minOnly) {
            applyScalableText(node, root, TITLE_DIVISOR, TITLE_MIN_SIZE);
        } else {
            applyScalableText(node, root, TITLE_DIVISOR);
        }
    }

    public static void applyHeaderScaling(final Node node, final Region root, final boolean clamp, final boolean minOnly)
    {
        if (clamp) {
            applyScalableText(node, root, HEADER_DIVISOR, HEADER_MIN_SIZE, HEADER_MAX_SIZE);
        } else if (minOnly) {
            applyScalableText(node, root, HEADER_DIVISOR, HEADER_MIN_SIZE);
        } else {
            applyScalableText(node, root, HEADER_DIVISOR);
        }
    }

    /**
     * Applies section-level dynamic font scaling to a node, scaled relative to
     * the root region. Section text is intended for major section dividers
     * within a screen.
     *
     * @param node    the node whose font size will scale
     * @param root    the root region whose width drives the scaling
     * @param clamp   if true, font size is bounded between SECTION_MIN_SIZE and SECTION_MAX_SIZE
     * @param minOnly if true, font size has a floor of SECTION_MIN_SIZE but no ceiling; ignored if clamp is true
     */
    public static void applySectionScaling(final Node node, final Region root, final boolean clamp, final boolean minOnly)
    {
        if (clamp) {
            applyScalableText(node, root, SECTION_DIVISOR, SECTION_MIN_SIZE, SECTION_MAX_SIZE);
        } else if (minOnly) {
            applyScalableText(node, root, SECTION_DIVISOR, SECTION_MIN_SIZE);
        } else {
            applyScalableText(node, root, SECTION_DIVISOR);
        }
    }

    /**
     * Applies subheading-level dynamic font scaling to a node, scaled relative
     * to the root region. Subheading text is intended for subsection labels
     * and card titles.
     *
     * @param node    the node whose font size will scale
     * @param root    the root region whose width drives the scaling
     * @param clamp   if true, font size is bounded between SUBHEAD_MIN_SIZE and SUBHEAD_MAX_SIZE
     * @param minOnly if true, font size has a floor of SUBHEAD_MIN_SIZE but no ceiling; ignored if clamp is true
     */
    public static void applySubheadScaling(final Node node, final Region root, final boolean clamp, final boolean minOnly)
    {
        if (clamp) {
            applyScalableText(node, root, SUBHEAD_DIVISOR, SUBHEAD_MIN_SIZE, SUBHEAD_MAX_SIZE);
        } else if (minOnly) {
            applyScalableText(node, root, SUBHEAD_DIVISOR, SUBHEAD_MIN_SIZE);
        } else {
            applyScalableText(node, root, SUBHEAD_DIVISOR);
        }
    }

    /**
     * Applies body-level dynamic font scaling to a node, scaled relative to the
     * root region. Body text is intended for paragraphs and standard
     * descriptive content.
     *
     * @param node    the node whose font size will scale
     * @param root    the root region whose width drives the scaling
     * @param clamp   if true, font size is bounded between BODY_MIN_SIZE and BODY_MAX_SIZE
     * @param minOnly if true, font size has a floor of BODY_MIN_SIZE but no ceiling; ignored if clamp is true
     */
    public static void applyBodyScaling(final Node node, final Region root, final boolean clamp, final boolean minOnly)
    {
        if (clamp) {
            applyScalableText(node, root, BODY_DIVISOR, BODY_MIN_SIZE, BODY_MAX_SIZE);
        } else if (minOnly) {
            applyScalableText(node, root, BODY_DIVISOR, BODY_MIN_SIZE);
        } else {
            applyScalableText(node, root, BODY_DIVISOR);
        }
    }

    /**
     * Applies caption-level dynamic font scaling to a node, scaled relative to
     * the root region. Caption text is intended for helper text, hints, and
     * timestamps.
     *
     * @param node    the node whose font size will scale
     * @param root    the root region whose width drives the scaling
     * @param clamp   if true, font size is bounded between CAPTION_MIN_SIZE and CAPTION_MAX_SIZE
     * @param minOnly if true, font size has a floor of CAPTION_MIN_SIZE but no ceiling; ignored if clamp is true
     */
    public static void applyCaptionScaling(final Node node, final Region root, final boolean clamp, final boolean minOnly)
    {
        if (clamp) {
            applyScalableText(node, root, CAPTION_DIVISOR, CAPTION_MIN_SIZE, CAPTION_MAX_SIZE);
        } else if (minOnly) {
            applyScalableText(node, root, CAPTION_DIVISOR, CAPTION_MIN_SIZE);
        } else {
            applyScalableText(node, root, CAPTION_DIVISOR);
        }
    }

    /**
     * Applies footer-level dynamic font scaling to a node, scaled relative to
     * the root region. Footer text is the smallest scale, intended for fine
     * print such as version numbers and copyright notices.
     *
     * @param node    the node whose font size will scale
     * @param root    the root region whose width drives the scaling
     * @param clamp   if true, font size is bounded between FOOTER_MIN_SIZE and FOOTER_MAX_SIZE
     * @param minOnly if true, font size has a floor of FOOTER_MIN_SIZE but no ceiling; ignored if clamp is true
     */
    public static void applyFooterScaling(final Node node, final Region root, final boolean clamp, final boolean minOnly)
    {
        if (clamp) {
            applyScalableText(node, root, FOOTER_DIVISOR, FOOTER_MIN_SIZE, FOOTER_MAX_SIZE);
        } else if (minOnly) {
            applyScalableText(node, root, FOOTER_DIVISOR, FOOTER_MIN_SIZE);
        } else {
            applyScalableText(node, root, FOOTER_DIVISOR);
        }
    }

    public static void bindParentToRegionWidth(final Region parent,
                                               final Region region)
    {
        parent.prefWidthProperty().bind(region.widthProperty());
    }
}