package org.xtext.urdf.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.urdf.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_AXIS_VALUE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Robot'", "'Link'", "'Joint'", "'Type'", "'ChildOf'", "'ParentOf'", "'Limit'", "'Axis'", "'Calibration'", "'Dynamics'", "'Mimic'", "'SafetyController'", "'Inertial'", "'Visual'", "'Geometry'", "'Material'", "'Collision'", "'Origin'", "'xyz'", "'roll_pitch_yaw'", "'Mass'", "'massValueInKilograms'", "'Inertia'", "'ixx'", "'ixy'", "'ixz'", "'iyy'", "'iyz'", "'izz'", "'Color'", "'red_green_blue_alpha'", "'Texture'", "'pathToFile'", "'Box'", "'height_length_width'", "'Cylinder'", "'radius'", "'length'", "'Mesh'", "'scale'", "'Sphere'", "'effort'", "'velocity'", "'lower'", "'upper'", "'rising'", "'falling'", "'friction'", "'damping'", "'mimics'", "'multiplier'", "'offSet'", "'softLowerLimit'", "'softUpperLimit'", "'k_position'", "'k_velocity'", "'.'", "'e'", "'+'", "'-'", "'Fixed'", "'Revolute'", "'Prismatic'", "'Continuous'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int RULE_AXIS_VALUE=6;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDsl.g"; }



     	private DslGrammarAccess grammarAccess;

        public InternalDslParser(TokenStream input, DslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Robot";
       	}

       	@Override
       	protected DslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRobot"
    // InternalDsl.g:65:1: entryRuleRobot returns [EObject current=null] : iv_ruleRobot= ruleRobot EOF ;
    public final EObject entryRuleRobot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobot = null;


        try {
            // InternalDsl.g:65:46: (iv_ruleRobot= ruleRobot EOF )
            // InternalDsl.g:66:2: iv_ruleRobot= ruleRobot EOF
            {
             newCompositeNode(grammarAccess.getRobotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRobot=ruleRobot();

            state._fsp--;

             current =iv_ruleRobot; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRobot"


    // $ANTLR start "ruleRobot"
    // InternalDsl.g:72:1: ruleRobot returns [EObject current=null] : (otherlv_0= 'Robot' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_link_2_0= ruleLink ) ) | ( (lv_joint_3_0= ruleJoint ) ) )* ) ;
    public final EObject ruleRobot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_link_2_0 = null;

        EObject lv_joint_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:78:2: ( (otherlv_0= 'Robot' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_link_2_0= ruleLink ) ) | ( (lv_joint_3_0= ruleJoint ) ) )* ) )
            // InternalDsl.g:79:2: (otherlv_0= 'Robot' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_link_2_0= ruleLink ) ) | ( (lv_joint_3_0= ruleJoint ) ) )* )
            {
            // InternalDsl.g:79:2: (otherlv_0= 'Robot' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_link_2_0= ruleLink ) ) | ( (lv_joint_3_0= ruleJoint ) ) )* )
            // InternalDsl.g:80:3: otherlv_0= 'Robot' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_link_2_0= ruleLink ) ) | ( (lv_joint_3_0= ruleJoint ) ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRobotAccess().getRobotKeyword_0());
            		
            // InternalDsl.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRobotAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRobotRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDsl.g:102:3: ( ( (lv_link_2_0= ruleLink ) ) | ( (lv_joint_3_0= ruleJoint ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }
                else if ( (LA1_0==14) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDsl.g:103:4: ( (lv_link_2_0= ruleLink ) )
            	    {
            	    // InternalDsl.g:103:4: ( (lv_link_2_0= ruleLink ) )
            	    // InternalDsl.g:104:5: (lv_link_2_0= ruleLink )
            	    {
            	    // InternalDsl.g:104:5: (lv_link_2_0= ruleLink )
            	    // InternalDsl.g:105:6: lv_link_2_0= ruleLink
            	    {

            	    						newCompositeNode(grammarAccess.getRobotAccess().getLinkLinkParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_link_2_0=ruleLink();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRobotRule());
            	    						}
            	    						add(
            	    							current,
            	    							"link",
            	    							lv_link_2_0,
            	    							"org.xtext.urdf.Dsl.Link");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDsl.g:123:4: ( (lv_joint_3_0= ruleJoint ) )
            	    {
            	    // InternalDsl.g:123:4: ( (lv_joint_3_0= ruleJoint ) )
            	    // InternalDsl.g:124:5: (lv_joint_3_0= ruleJoint )
            	    {
            	    // InternalDsl.g:124:5: (lv_joint_3_0= ruleJoint )
            	    // InternalDsl.g:125:6: lv_joint_3_0= ruleJoint
            	    {

            	    						newCompositeNode(grammarAccess.getRobotAccess().getJointJointParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_joint_3_0=ruleJoint();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRobotRule());
            	    						}
            	    						add(
            	    							current,
            	    							"joint",
            	    							lv_joint_3_0,
            	    							"org.xtext.urdf.Dsl.Joint");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRobot"


    // $ANTLR start "entryRuleMaterial"
    // InternalDsl.g:147:1: entryRuleMaterial returns [EObject current=null] : iv_ruleMaterial= ruleMaterial EOF ;
    public final EObject entryRuleMaterial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaterial = null;


        try {
            // InternalDsl.g:147:49: (iv_ruleMaterial= ruleMaterial EOF )
            // InternalDsl.g:148:2: iv_ruleMaterial= ruleMaterial EOF
            {
             newCompositeNode(grammarAccess.getMaterialRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaterial=ruleMaterial();

            state._fsp--;

             current =iv_ruleMaterial; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMaterial"


    // $ANTLR start "ruleMaterial"
    // InternalDsl.g:154:1: ruleMaterial returns [EObject current=null] : (this_Color_0= ruleColor | this_Texture_1= ruleTexture ) ;
    public final EObject ruleMaterial() throws RecognitionException {
        EObject current = null;

        EObject this_Color_0 = null;

        EObject this_Texture_1 = null;



        	enterRule();

        try {
            // InternalDsl.g:160:2: ( (this_Color_0= ruleColor | this_Texture_1= ruleTexture ) )
            // InternalDsl.g:161:2: (this_Color_0= ruleColor | this_Texture_1= ruleTexture )
            {
            // InternalDsl.g:161:2: (this_Color_0= ruleColor | this_Texture_1= ruleTexture )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==41) ) {
                alt2=1;
            }
            else if ( (LA2_0==43) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDsl.g:162:3: this_Color_0= ruleColor
                    {

                    			newCompositeNode(grammarAccess.getMaterialAccess().getColorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Color_0=ruleColor();

                    state._fsp--;


                    			current = this_Color_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:171:3: this_Texture_1= ruleTexture
                    {

                    			newCompositeNode(grammarAccess.getMaterialAccess().getTextureParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Texture_1=ruleTexture();

                    state._fsp--;


                    			current = this_Texture_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMaterial"


    // $ANTLR start "entryRuleGeometry"
    // InternalDsl.g:183:1: entryRuleGeometry returns [EObject current=null] : iv_ruleGeometry= ruleGeometry EOF ;
    public final EObject entryRuleGeometry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeometry = null;


        try {
            // InternalDsl.g:183:49: (iv_ruleGeometry= ruleGeometry EOF )
            // InternalDsl.g:184:2: iv_ruleGeometry= ruleGeometry EOF
            {
             newCompositeNode(grammarAccess.getGeometryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeometry=ruleGeometry();

            state._fsp--;

             current =iv_ruleGeometry; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGeometry"


    // $ANTLR start "ruleGeometry"
    // InternalDsl.g:190:1: ruleGeometry returns [EObject current=null] : (this_Box_0= ruleBox | this_Cylinder_1= ruleCylinder | this_Mesh_2= ruleMesh | this_Sphere_3= ruleSphere ) ;
    public final EObject ruleGeometry() throws RecognitionException {
        EObject current = null;

        EObject this_Box_0 = null;

        EObject this_Cylinder_1 = null;

        EObject this_Mesh_2 = null;

        EObject this_Sphere_3 = null;



        	enterRule();

        try {
            // InternalDsl.g:196:2: ( (this_Box_0= ruleBox | this_Cylinder_1= ruleCylinder | this_Mesh_2= ruleMesh | this_Sphere_3= ruleSphere ) )
            // InternalDsl.g:197:2: (this_Box_0= ruleBox | this_Cylinder_1= ruleCylinder | this_Mesh_2= ruleMesh | this_Sphere_3= ruleSphere )
            {
            // InternalDsl.g:197:2: (this_Box_0= ruleBox | this_Cylinder_1= ruleCylinder | this_Mesh_2= ruleMesh | this_Sphere_3= ruleSphere )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt3=1;
                }
                break;
            case 47:
                {
                alt3=2;
                }
                break;
            case 50:
                {
                alt3=3;
                }
                break;
            case 52:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDsl.g:198:3: this_Box_0= ruleBox
                    {

                    			newCompositeNode(grammarAccess.getGeometryAccess().getBoxParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Box_0=ruleBox();

                    state._fsp--;


                    			current = this_Box_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:207:3: this_Cylinder_1= ruleCylinder
                    {

                    			newCompositeNode(grammarAccess.getGeometryAccess().getCylinderParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Cylinder_1=ruleCylinder();

                    state._fsp--;


                    			current = this_Cylinder_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDsl.g:216:3: this_Mesh_2= ruleMesh
                    {

                    			newCompositeNode(grammarAccess.getGeometryAccess().getMeshParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Mesh_2=ruleMesh();

                    state._fsp--;


                    			current = this_Mesh_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDsl.g:225:3: this_Sphere_3= ruleSphere
                    {

                    			newCompositeNode(grammarAccess.getGeometryAccess().getSphereParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sphere_3=ruleSphere();

                    state._fsp--;


                    			current = this_Sphere_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGeometry"


    // $ANTLR start "entryRuleLink"
    // InternalDsl.g:237:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalDsl.g:237:45: (iv_ruleLink= ruleLink EOF )
            // InternalDsl.g:238:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // InternalDsl.g:244:1: ruleLink returns [EObject current=null] : (otherlv_0= 'Link' ( (lv_name_1_0= RULE_ID ) ) ( (lv_visuals_2_0= ruleVisual ) )* ( (lv_inertial_3_0= ruleInertial ) )* ( (lv_collision_4_0= ruleCollision ) )* ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_visuals_2_0 = null;

        EObject lv_inertial_3_0 = null;

        EObject lv_collision_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:250:2: ( (otherlv_0= 'Link' ( (lv_name_1_0= RULE_ID ) ) ( (lv_visuals_2_0= ruleVisual ) )* ( (lv_inertial_3_0= ruleInertial ) )* ( (lv_collision_4_0= ruleCollision ) )* ) )
            // InternalDsl.g:251:2: (otherlv_0= 'Link' ( (lv_name_1_0= RULE_ID ) ) ( (lv_visuals_2_0= ruleVisual ) )* ( (lv_inertial_3_0= ruleInertial ) )* ( (lv_collision_4_0= ruleCollision ) )* )
            {
            // InternalDsl.g:251:2: (otherlv_0= 'Link' ( (lv_name_1_0= RULE_ID ) ) ( (lv_visuals_2_0= ruleVisual ) )* ( (lv_inertial_3_0= ruleInertial ) )* ( (lv_collision_4_0= ruleCollision ) )* )
            // InternalDsl.g:252:3: otherlv_0= 'Link' ( (lv_name_1_0= RULE_ID ) ) ( (lv_visuals_2_0= ruleVisual ) )* ( (lv_inertial_3_0= ruleInertial ) )* ( (lv_collision_4_0= ruleCollision ) )*
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
            		
            // InternalDsl.g:256:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:257:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:257:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:258:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLinkAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDsl.g:274:3: ( (lv_visuals_2_0= ruleVisual ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==25) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDsl.g:275:4: (lv_visuals_2_0= ruleVisual )
            	    {
            	    // InternalDsl.g:275:4: (lv_visuals_2_0= ruleVisual )
            	    // InternalDsl.g:276:5: lv_visuals_2_0= ruleVisual
            	    {

            	    					newCompositeNode(grammarAccess.getLinkAccess().getVisualsVisualParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_visuals_2_0=ruleVisual();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLinkRule());
            	    					}
            	    					add(
            	    						current,
            	    						"visuals",
            	    						lv_visuals_2_0,
            	    						"org.xtext.urdf.Dsl.Visual");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalDsl.g:293:3: ( (lv_inertial_3_0= ruleInertial ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==24) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDsl.g:294:4: (lv_inertial_3_0= ruleInertial )
            	    {
            	    // InternalDsl.g:294:4: (lv_inertial_3_0= ruleInertial )
            	    // InternalDsl.g:295:5: lv_inertial_3_0= ruleInertial
            	    {

            	    					newCompositeNode(grammarAccess.getLinkAccess().getInertialInertialParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_inertial_3_0=ruleInertial();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLinkRule());
            	    					}
            	    					add(
            	    						current,
            	    						"inertial",
            	    						lv_inertial_3_0,
            	    						"org.xtext.urdf.Dsl.Inertial");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalDsl.g:312:3: ( (lv_collision_4_0= ruleCollision ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==28) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDsl.g:313:4: (lv_collision_4_0= ruleCollision )
            	    {
            	    // InternalDsl.g:313:4: (lv_collision_4_0= ruleCollision )
            	    // InternalDsl.g:314:5: lv_collision_4_0= ruleCollision
            	    {

            	    					newCompositeNode(grammarAccess.getLinkAccess().getCollisionCollisionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_collision_4_0=ruleCollision();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLinkRule());
            	    					}
            	    					add(
            	    						current,
            	    						"collision",
            	    						lv_collision_4_0,
            	    						"org.xtext.urdf.Dsl.Collision");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRuleJoint"
    // InternalDsl.g:335:1: entryRuleJoint returns [EObject current=null] : iv_ruleJoint= ruleJoint EOF ;
    public final EObject entryRuleJoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoint = null;


        try {
            // InternalDsl.g:335:46: (iv_ruleJoint= ruleJoint EOF )
            // InternalDsl.g:336:2: iv_ruleJoint= ruleJoint EOF
            {
             newCompositeNode(grammarAccess.getJointRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJoint=ruleJoint();

            state._fsp--;

             current =iv_ruleJoint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJoint"


    // $ANTLR start "ruleJoint"
    // InternalDsl.g:342:1: ruleJoint returns [EObject current=null] : (otherlv_0= 'Joint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Type' ( (lv_Type_3_0= ruleJointType ) ) otherlv_4= 'ChildOf' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'ParentOf' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'Limit' ( (lv_limit_9_0= ruleLimit ) ) )? (otherlv_10= 'Axis' ( (lv_axis_11_0= ruleAxis ) ) )? ( (lv_origin_12_0= ruleOrigin ) )? (otherlv_13= 'Calibration' ( (lv_calibration_14_0= ruleCalibration ) ) )? (otherlv_15= 'Dynamics' ( (lv_dynamics_16_0= ruleDynamics ) ) )? (otherlv_17= 'Mimic' ( (lv_mimic_18_0= ruleMimic ) ) )? (otherlv_19= 'SafetyController' ( (lv_safetycontroller_20_0= ruleSafetyController ) ) )? ) ;
    public final EObject ruleJoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Enumerator lv_Type_3_0 = null;

        EObject lv_limit_9_0 = null;

        EObject lv_axis_11_0 = null;

        EObject lv_origin_12_0 = null;

        EObject lv_calibration_14_0 = null;

        EObject lv_dynamics_16_0 = null;

        EObject lv_mimic_18_0 = null;

        EObject lv_safetycontroller_20_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:348:2: ( (otherlv_0= 'Joint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Type' ( (lv_Type_3_0= ruleJointType ) ) otherlv_4= 'ChildOf' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'ParentOf' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'Limit' ( (lv_limit_9_0= ruleLimit ) ) )? (otherlv_10= 'Axis' ( (lv_axis_11_0= ruleAxis ) ) )? ( (lv_origin_12_0= ruleOrigin ) )? (otherlv_13= 'Calibration' ( (lv_calibration_14_0= ruleCalibration ) ) )? (otherlv_15= 'Dynamics' ( (lv_dynamics_16_0= ruleDynamics ) ) )? (otherlv_17= 'Mimic' ( (lv_mimic_18_0= ruleMimic ) ) )? (otherlv_19= 'SafetyController' ( (lv_safetycontroller_20_0= ruleSafetyController ) ) )? ) )
            // InternalDsl.g:349:2: (otherlv_0= 'Joint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Type' ( (lv_Type_3_0= ruleJointType ) ) otherlv_4= 'ChildOf' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'ParentOf' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'Limit' ( (lv_limit_9_0= ruleLimit ) ) )? (otherlv_10= 'Axis' ( (lv_axis_11_0= ruleAxis ) ) )? ( (lv_origin_12_0= ruleOrigin ) )? (otherlv_13= 'Calibration' ( (lv_calibration_14_0= ruleCalibration ) ) )? (otherlv_15= 'Dynamics' ( (lv_dynamics_16_0= ruleDynamics ) ) )? (otherlv_17= 'Mimic' ( (lv_mimic_18_0= ruleMimic ) ) )? (otherlv_19= 'SafetyController' ( (lv_safetycontroller_20_0= ruleSafetyController ) ) )? )
            {
            // InternalDsl.g:349:2: (otherlv_0= 'Joint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Type' ( (lv_Type_3_0= ruleJointType ) ) otherlv_4= 'ChildOf' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'ParentOf' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'Limit' ( (lv_limit_9_0= ruleLimit ) ) )? (otherlv_10= 'Axis' ( (lv_axis_11_0= ruleAxis ) ) )? ( (lv_origin_12_0= ruleOrigin ) )? (otherlv_13= 'Calibration' ( (lv_calibration_14_0= ruleCalibration ) ) )? (otherlv_15= 'Dynamics' ( (lv_dynamics_16_0= ruleDynamics ) ) )? (otherlv_17= 'Mimic' ( (lv_mimic_18_0= ruleMimic ) ) )? (otherlv_19= 'SafetyController' ( (lv_safetycontroller_20_0= ruleSafetyController ) ) )? )
            // InternalDsl.g:350:3: otherlv_0= 'Joint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Type' ( (lv_Type_3_0= ruleJointType ) ) otherlv_4= 'ChildOf' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'ParentOf' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'Limit' ( (lv_limit_9_0= ruleLimit ) ) )? (otherlv_10= 'Axis' ( (lv_axis_11_0= ruleAxis ) ) )? ( (lv_origin_12_0= ruleOrigin ) )? (otherlv_13= 'Calibration' ( (lv_calibration_14_0= ruleCalibration ) ) )? (otherlv_15= 'Dynamics' ( (lv_dynamics_16_0= ruleDynamics ) ) )? (otherlv_17= 'Mimic' ( (lv_mimic_18_0= ruleMimic ) ) )? (otherlv_19= 'SafetyController' ( (lv_safetycontroller_20_0= ruleSafetyController ) ) )?
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJointAccess().getJointKeyword_0());
            		
            // InternalDsl.g:354:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:355:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:355:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:356:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getJointAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJointRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getJointAccess().getTypeKeyword_2());
            		
            // InternalDsl.g:376:3: ( (lv_Type_3_0= ruleJointType ) )
            // InternalDsl.g:377:4: (lv_Type_3_0= ruleJointType )
            {
            // InternalDsl.g:377:4: (lv_Type_3_0= ruleJointType )
            // InternalDsl.g:378:5: lv_Type_3_0= ruleJointType
            {

            					newCompositeNode(grammarAccess.getJointAccess().getTypeJointTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_Type_3_0=ruleJointType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJointRule());
            					}
            					set(
            						current,
            						"Type",
            						lv_Type_3_0,
            						"org.xtext.urdf.Dsl.JointType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getJointAccess().getChildOfKeyword_4());
            		
            // InternalDsl.g:399:3: ( (otherlv_5= RULE_ID ) )
            // InternalDsl.g:400:4: (otherlv_5= RULE_ID )
            {
            // InternalDsl.g:400:4: (otherlv_5= RULE_ID )
            // InternalDsl.g:401:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJointRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_5, grammarAccess.getJointAccess().getChildOfLinkCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getJointAccess().getParentOfKeyword_6());
            		
            // InternalDsl.g:416:3: ( (otherlv_7= RULE_ID ) )
            // InternalDsl.g:417:4: (otherlv_7= RULE_ID )
            {
            // InternalDsl.g:417:4: (otherlv_7= RULE_ID )
            // InternalDsl.g:418:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJointRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_7, grammarAccess.getJointAccess().getParentOfLinkCrossReference_7_0());
            				

            }


            }

            // InternalDsl.g:429:3: (otherlv_8= 'Limit' ( (lv_limit_9_0= ruleLimit ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDsl.g:430:4: otherlv_8= 'Limit' ( (lv_limit_9_0= ruleLimit ) )
                    {
                    otherlv_8=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_8, grammarAccess.getJointAccess().getLimitKeyword_8_0());
                    			
                    // InternalDsl.g:434:4: ( (lv_limit_9_0= ruleLimit ) )
                    // InternalDsl.g:435:5: (lv_limit_9_0= ruleLimit )
                    {
                    // InternalDsl.g:435:5: (lv_limit_9_0= ruleLimit )
                    // InternalDsl.g:436:6: lv_limit_9_0= ruleLimit
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getLimitLimitParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_limit_9_0=ruleLimit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJointRule());
                    						}
                    						set(
                    							current,
                    							"limit",
                    							lv_limit_9_0,
                    							"org.xtext.urdf.Dsl.Limit");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:454:3: (otherlv_10= 'Axis' ( (lv_axis_11_0= ruleAxis ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDsl.g:455:4: otherlv_10= 'Axis' ( (lv_axis_11_0= ruleAxis ) )
                    {
                    otherlv_10=(Token)match(input,19,FOLLOW_15); 

                    				newLeafNode(otherlv_10, grammarAccess.getJointAccess().getAxisKeyword_9_0());
                    			
                    // InternalDsl.g:459:4: ( (lv_axis_11_0= ruleAxis ) )
                    // InternalDsl.g:460:5: (lv_axis_11_0= ruleAxis )
                    {
                    // InternalDsl.g:460:5: (lv_axis_11_0= ruleAxis )
                    // InternalDsl.g:461:6: lv_axis_11_0= ruleAxis
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getAxisAxisParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_axis_11_0=ruleAxis();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJointRule());
                    						}
                    						set(
                    							current,
                    							"axis",
                    							lv_axis_11_0,
                    							"org.xtext.urdf.Dsl.Axis");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:479:3: ( (lv_origin_12_0= ruleOrigin ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDsl.g:480:4: (lv_origin_12_0= ruleOrigin )
                    {
                    // InternalDsl.g:480:4: (lv_origin_12_0= ruleOrigin )
                    // InternalDsl.g:481:5: lv_origin_12_0= ruleOrigin
                    {

                    					newCompositeNode(grammarAccess.getJointAccess().getOriginOriginParserRuleCall_10_0());
                    				
                    pushFollow(FOLLOW_17);
                    lv_origin_12_0=ruleOrigin();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getJointRule());
                    					}
                    					set(
                    						current,
                    						"origin",
                    						lv_origin_12_0,
                    						"org.xtext.urdf.Dsl.Origin");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDsl.g:498:3: (otherlv_13= 'Calibration' ( (lv_calibration_14_0= ruleCalibration ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDsl.g:499:4: otherlv_13= 'Calibration' ( (lv_calibration_14_0= ruleCalibration ) )
                    {
                    otherlv_13=(Token)match(input,20,FOLLOW_18); 

                    				newLeafNode(otherlv_13, grammarAccess.getJointAccess().getCalibrationKeyword_11_0());
                    			
                    // InternalDsl.g:503:4: ( (lv_calibration_14_0= ruleCalibration ) )
                    // InternalDsl.g:504:5: (lv_calibration_14_0= ruleCalibration )
                    {
                    // InternalDsl.g:504:5: (lv_calibration_14_0= ruleCalibration )
                    // InternalDsl.g:505:6: lv_calibration_14_0= ruleCalibration
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getCalibrationCalibrationParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_calibration_14_0=ruleCalibration();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJointRule());
                    						}
                    						set(
                    							current,
                    							"calibration",
                    							lv_calibration_14_0,
                    							"org.xtext.urdf.Dsl.Calibration");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:523:3: (otherlv_15= 'Dynamics' ( (lv_dynamics_16_0= ruleDynamics ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDsl.g:524:4: otherlv_15= 'Dynamics' ( (lv_dynamics_16_0= ruleDynamics ) )
                    {
                    otherlv_15=(Token)match(input,21,FOLLOW_20); 

                    				newLeafNode(otherlv_15, grammarAccess.getJointAccess().getDynamicsKeyword_12_0());
                    			
                    // InternalDsl.g:528:4: ( (lv_dynamics_16_0= ruleDynamics ) )
                    // InternalDsl.g:529:5: (lv_dynamics_16_0= ruleDynamics )
                    {
                    // InternalDsl.g:529:5: (lv_dynamics_16_0= ruleDynamics )
                    // InternalDsl.g:530:6: lv_dynamics_16_0= ruleDynamics
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getDynamicsDynamicsParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_dynamics_16_0=ruleDynamics();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJointRule());
                    						}
                    						set(
                    							current,
                    							"dynamics",
                    							lv_dynamics_16_0,
                    							"org.xtext.urdf.Dsl.Dynamics");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:548:3: (otherlv_17= 'Mimic' ( (lv_mimic_18_0= ruleMimic ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDsl.g:549:4: otherlv_17= 'Mimic' ( (lv_mimic_18_0= ruleMimic ) )
                    {
                    otherlv_17=(Token)match(input,22,FOLLOW_22); 

                    				newLeafNode(otherlv_17, grammarAccess.getJointAccess().getMimicKeyword_13_0());
                    			
                    // InternalDsl.g:553:4: ( (lv_mimic_18_0= ruleMimic ) )
                    // InternalDsl.g:554:5: (lv_mimic_18_0= ruleMimic )
                    {
                    // InternalDsl.g:554:5: (lv_mimic_18_0= ruleMimic )
                    // InternalDsl.g:555:6: lv_mimic_18_0= ruleMimic
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getMimicMimicParserRuleCall_13_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_mimic_18_0=ruleMimic();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJointRule());
                    						}
                    						set(
                    							current,
                    							"mimic",
                    							lv_mimic_18_0,
                    							"org.xtext.urdf.Dsl.Mimic");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:573:3: (otherlv_19= 'SafetyController' ( (lv_safetycontroller_20_0= ruleSafetyController ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDsl.g:574:4: otherlv_19= 'SafetyController' ( (lv_safetycontroller_20_0= ruleSafetyController ) )
                    {
                    otherlv_19=(Token)match(input,23,FOLLOW_24); 

                    				newLeafNode(otherlv_19, grammarAccess.getJointAccess().getSafetyControllerKeyword_14_0());
                    			
                    // InternalDsl.g:578:4: ( (lv_safetycontroller_20_0= ruleSafetyController ) )
                    // InternalDsl.g:579:5: (lv_safetycontroller_20_0= ruleSafetyController )
                    {
                    // InternalDsl.g:579:5: (lv_safetycontroller_20_0= ruleSafetyController )
                    // InternalDsl.g:580:6: lv_safetycontroller_20_0= ruleSafetyController
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getSafetycontrollerSafetyControllerParserRuleCall_14_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_safetycontroller_20_0=ruleSafetyController();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJointRule());
                    						}
                    						set(
                    							current,
                    							"safetycontroller",
                    							lv_safetycontroller_20_0,
                    							"org.xtext.urdf.Dsl.SafetyController");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJoint"


    // $ANTLR start "entryRuleInertial"
    // InternalDsl.g:602:1: entryRuleInertial returns [EObject current=null] : iv_ruleInertial= ruleInertial EOF ;
    public final EObject entryRuleInertial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInertial = null;


        try {
            // InternalDsl.g:602:49: (iv_ruleInertial= ruleInertial EOF )
            // InternalDsl.g:603:2: iv_ruleInertial= ruleInertial EOF
            {
             newCompositeNode(grammarAccess.getInertialRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInertial=ruleInertial();

            state._fsp--;

             current =iv_ruleInertial; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInertial"


    // $ANTLR start "ruleInertial"
    // InternalDsl.g:609:1: ruleInertial returns [EObject current=null] : (otherlv_0= 'Inertial' ( (lv_name_1_0= RULE_ID ) )? ( (lv_inertia_2_0= ruleInertia ) ) ( (lv_mass_3_0= ruleMass ) ) ( (lv_origin_4_0= ruleOrigin ) )? ) ;
    public final EObject ruleInertial() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_inertia_2_0 = null;

        EObject lv_mass_3_0 = null;

        EObject lv_origin_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:615:2: ( (otherlv_0= 'Inertial' ( (lv_name_1_0= RULE_ID ) )? ( (lv_inertia_2_0= ruleInertia ) ) ( (lv_mass_3_0= ruleMass ) ) ( (lv_origin_4_0= ruleOrigin ) )? ) )
            // InternalDsl.g:616:2: (otherlv_0= 'Inertial' ( (lv_name_1_0= RULE_ID ) )? ( (lv_inertia_2_0= ruleInertia ) ) ( (lv_mass_3_0= ruleMass ) ) ( (lv_origin_4_0= ruleOrigin ) )? )
            {
            // InternalDsl.g:616:2: (otherlv_0= 'Inertial' ( (lv_name_1_0= RULE_ID ) )? ( (lv_inertia_2_0= ruleInertia ) ) ( (lv_mass_3_0= ruleMass ) ) ( (lv_origin_4_0= ruleOrigin ) )? )
            // InternalDsl.g:617:3: otherlv_0= 'Inertial' ( (lv_name_1_0= RULE_ID ) )? ( (lv_inertia_2_0= ruleInertia ) ) ( (lv_mass_3_0= ruleMass ) ) ( (lv_origin_4_0= ruleOrigin ) )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getInertialAccess().getInertialKeyword_0());
            		
            // InternalDsl.g:621:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDsl.g:622:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalDsl.g:622:4: (lv_name_1_0= RULE_ID )
                    // InternalDsl.g:623:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_25); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getInertialAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInertialRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalDsl.g:639:3: ( (lv_inertia_2_0= ruleInertia ) )
            // InternalDsl.g:640:4: (lv_inertia_2_0= ruleInertia )
            {
            // InternalDsl.g:640:4: (lv_inertia_2_0= ruleInertia )
            // InternalDsl.g:641:5: lv_inertia_2_0= ruleInertia
            {

            					newCompositeNode(grammarAccess.getInertialAccess().getInertiaInertiaParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_26);
            lv_inertia_2_0=ruleInertia();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInertialRule());
            					}
            					set(
            						current,
            						"inertia",
            						lv_inertia_2_0,
            						"org.xtext.urdf.Dsl.Inertia");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:658:3: ( (lv_mass_3_0= ruleMass ) )
            // InternalDsl.g:659:4: (lv_mass_3_0= ruleMass )
            {
            // InternalDsl.g:659:4: (lv_mass_3_0= ruleMass )
            // InternalDsl.g:660:5: lv_mass_3_0= ruleMass
            {

            					newCompositeNode(grammarAccess.getInertialAccess().getMassMassParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_27);
            lv_mass_3_0=ruleMass();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInertialRule());
            					}
            					set(
            						current,
            						"mass",
            						lv_mass_3_0,
            						"org.xtext.urdf.Dsl.Mass");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:677:3: ( (lv_origin_4_0= ruleOrigin ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDsl.g:678:4: (lv_origin_4_0= ruleOrigin )
                    {
                    // InternalDsl.g:678:4: (lv_origin_4_0= ruleOrigin )
                    // InternalDsl.g:679:5: lv_origin_4_0= ruleOrigin
                    {

                    					newCompositeNode(grammarAccess.getInertialAccess().getOriginOriginParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_origin_4_0=ruleOrigin();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInertialRule());
                    					}
                    					set(
                    						current,
                    						"origin",
                    						lv_origin_4_0,
                    						"org.xtext.urdf.Dsl.Origin");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInertial"


    // $ANTLR start "entryRuleVisual"
    // InternalDsl.g:700:1: entryRuleVisual returns [EObject current=null] : iv_ruleVisual= ruleVisual EOF ;
    public final EObject entryRuleVisual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisual = null;


        try {
            // InternalDsl.g:700:47: (iv_ruleVisual= ruleVisual EOF )
            // InternalDsl.g:701:2: iv_ruleVisual= ruleVisual EOF
            {
             newCompositeNode(grammarAccess.getVisualRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVisual=ruleVisual();

            state._fsp--;

             current =iv_ruleVisual; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVisual"


    // $ANTLR start "ruleVisual"
    // InternalDsl.g:707:1: ruleVisual returns [EObject current=null] : (otherlv_0= 'Visual' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'Geometry' ( (lv_geometry_3_0= ruleGeometry ) ) ( (lv_origin_4_0= ruleOrigin ) )? (otherlv_5= 'Material' ( (lv_material_6_0= ruleMaterial ) ) )? ) ;
    public final EObject ruleVisual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_geometry_3_0 = null;

        EObject lv_origin_4_0 = null;

        EObject lv_material_6_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:713:2: ( (otherlv_0= 'Visual' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'Geometry' ( (lv_geometry_3_0= ruleGeometry ) ) ( (lv_origin_4_0= ruleOrigin ) )? (otherlv_5= 'Material' ( (lv_material_6_0= ruleMaterial ) ) )? ) )
            // InternalDsl.g:714:2: (otherlv_0= 'Visual' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'Geometry' ( (lv_geometry_3_0= ruleGeometry ) ) ( (lv_origin_4_0= ruleOrigin ) )? (otherlv_5= 'Material' ( (lv_material_6_0= ruleMaterial ) ) )? )
            {
            // InternalDsl.g:714:2: (otherlv_0= 'Visual' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'Geometry' ( (lv_geometry_3_0= ruleGeometry ) ) ( (lv_origin_4_0= ruleOrigin ) )? (otherlv_5= 'Material' ( (lv_material_6_0= ruleMaterial ) ) )? )
            // InternalDsl.g:715:3: otherlv_0= 'Visual' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'Geometry' ( (lv_geometry_3_0= ruleGeometry ) ) ( (lv_origin_4_0= ruleOrigin ) )? (otherlv_5= 'Material' ( (lv_material_6_0= ruleMaterial ) ) )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getVisualAccess().getVisualKeyword_0());
            		
            // InternalDsl.g:719:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDsl.g:720:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalDsl.g:720:4: (lv_name_1_0= RULE_ID )
                    // InternalDsl.g:721:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_29); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getVisualAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVisualRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,26,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getVisualAccess().getGeometryKeyword_2());
            		
            // InternalDsl.g:741:3: ( (lv_geometry_3_0= ruleGeometry ) )
            // InternalDsl.g:742:4: (lv_geometry_3_0= ruleGeometry )
            {
            // InternalDsl.g:742:4: (lv_geometry_3_0= ruleGeometry )
            // InternalDsl.g:743:5: lv_geometry_3_0= ruleGeometry
            {

            					newCompositeNode(grammarAccess.getVisualAccess().getGeometryGeometryParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_31);
            lv_geometry_3_0=ruleGeometry();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVisualRule());
            					}
            					set(
            						current,
            						"geometry",
            						lv_geometry_3_0,
            						"org.xtext.urdf.Dsl.Geometry");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:760:3: ( (lv_origin_4_0= ruleOrigin ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDsl.g:761:4: (lv_origin_4_0= ruleOrigin )
                    {
                    // InternalDsl.g:761:4: (lv_origin_4_0= ruleOrigin )
                    // InternalDsl.g:762:5: lv_origin_4_0= ruleOrigin
                    {

                    					newCompositeNode(grammarAccess.getVisualAccess().getOriginOriginParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_32);
                    lv_origin_4_0=ruleOrigin();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVisualRule());
                    					}
                    					set(
                    						current,
                    						"origin",
                    						lv_origin_4_0,
                    						"org.xtext.urdf.Dsl.Origin");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDsl.g:779:3: (otherlv_5= 'Material' ( (lv_material_6_0= ruleMaterial ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDsl.g:780:4: otherlv_5= 'Material' ( (lv_material_6_0= ruleMaterial ) )
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_33); 

                    				newLeafNode(otherlv_5, grammarAccess.getVisualAccess().getMaterialKeyword_5_0());
                    			
                    // InternalDsl.g:784:4: ( (lv_material_6_0= ruleMaterial ) )
                    // InternalDsl.g:785:5: (lv_material_6_0= ruleMaterial )
                    {
                    // InternalDsl.g:785:5: (lv_material_6_0= ruleMaterial )
                    // InternalDsl.g:786:6: lv_material_6_0= ruleMaterial
                    {

                    						newCompositeNode(grammarAccess.getVisualAccess().getMaterialMaterialParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_material_6_0=ruleMaterial();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVisualRule());
                    						}
                    						set(
                    							current,
                    							"material",
                    							lv_material_6_0,
                    							"org.xtext.urdf.Dsl.Material");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVisual"


    // $ANTLR start "entryRuleCollision"
    // InternalDsl.g:808:1: entryRuleCollision returns [EObject current=null] : iv_ruleCollision= ruleCollision EOF ;
    public final EObject entryRuleCollision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollision = null;


        try {
            // InternalDsl.g:808:50: (iv_ruleCollision= ruleCollision EOF )
            // InternalDsl.g:809:2: iv_ruleCollision= ruleCollision EOF
            {
             newCompositeNode(grammarAccess.getCollisionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCollision=ruleCollision();

            state._fsp--;

             current =iv_ruleCollision; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCollision"


    // $ANTLR start "ruleCollision"
    // InternalDsl.g:815:1: ruleCollision returns [EObject current=null] : (otherlv_0= 'Collision' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Geometry' ( (lv_geometry_3_0= ruleGeometry ) ) ( (lv_origin_4_0= ruleOrigin ) )? ) ;
    public final EObject ruleCollision() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_geometry_3_0 = null;

        EObject lv_origin_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:821:2: ( (otherlv_0= 'Collision' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Geometry' ( (lv_geometry_3_0= ruleGeometry ) ) ( (lv_origin_4_0= ruleOrigin ) )? ) )
            // InternalDsl.g:822:2: (otherlv_0= 'Collision' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Geometry' ( (lv_geometry_3_0= ruleGeometry ) ) ( (lv_origin_4_0= ruleOrigin ) )? )
            {
            // InternalDsl.g:822:2: (otherlv_0= 'Collision' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Geometry' ( (lv_geometry_3_0= ruleGeometry ) ) ( (lv_origin_4_0= ruleOrigin ) )? )
            // InternalDsl.g:823:3: otherlv_0= 'Collision' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Geometry' ( (lv_geometry_3_0= ruleGeometry ) ) ( (lv_origin_4_0= ruleOrigin ) )?
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCollisionAccess().getCollisionKeyword_0());
            		
            // InternalDsl.g:827:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:828:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:828:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:829:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCollisionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCollisionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getCollisionAccess().getGeometryKeyword_2());
            		
            // InternalDsl.g:849:3: ( (lv_geometry_3_0= ruleGeometry ) )
            // InternalDsl.g:850:4: (lv_geometry_3_0= ruleGeometry )
            {
            // InternalDsl.g:850:4: (lv_geometry_3_0= ruleGeometry )
            // InternalDsl.g:851:5: lv_geometry_3_0= ruleGeometry
            {

            					newCompositeNode(grammarAccess.getCollisionAccess().getGeometryGeometryParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_27);
            lv_geometry_3_0=ruleGeometry();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCollisionRule());
            					}
            					set(
            						current,
            						"geometry",
            						lv_geometry_3_0,
            						"org.xtext.urdf.Dsl.Geometry");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:868:3: ( (lv_origin_4_0= ruleOrigin ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDsl.g:869:4: (lv_origin_4_0= ruleOrigin )
                    {
                    // InternalDsl.g:869:4: (lv_origin_4_0= ruleOrigin )
                    // InternalDsl.g:870:5: lv_origin_4_0= ruleOrigin
                    {

                    					newCompositeNode(grammarAccess.getCollisionAccess().getOriginOriginParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_origin_4_0=ruleOrigin();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCollisionRule());
                    					}
                    					set(
                    						current,
                    						"origin",
                    						lv_origin_4_0,
                    						"org.xtext.urdf.Dsl.Origin");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCollision"


    // $ANTLR start "entryRuleOrigin"
    // InternalDsl.g:891:1: entryRuleOrigin returns [EObject current=null] : iv_ruleOrigin= ruleOrigin EOF ;
    public final EObject entryRuleOrigin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrigin = null;


        try {
            // InternalDsl.g:891:47: (iv_ruleOrigin= ruleOrigin EOF )
            // InternalDsl.g:892:2: iv_ruleOrigin= ruleOrigin EOF
            {
             newCompositeNode(grammarAccess.getOriginRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrigin=ruleOrigin();

            state._fsp--;

             current =iv_ruleOrigin; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrigin"


    // $ANTLR start "ruleOrigin"
    // InternalDsl.g:898:1: ruleOrigin returns [EObject current=null] : (otherlv_0= 'Origin' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'xyz' ( (lv_x_3_0= ruleSIGNED_NUMERIC ) ) ( (lv_y_4_0= ruleSIGNED_NUMERIC ) ) ( (lv_z_5_0= ruleSIGNED_NUMERIC ) ) (otherlv_6= 'roll_pitch_yaw' ( (lv_roll_7_0= ruleSIGNED_NUMERIC ) ) ( (lv_pitch_8_0= ruleSIGNED_NUMERIC ) ) ( (lv_yaw_9_0= ruleSIGNED_NUMERIC ) ) )? ) ;
    public final EObject ruleOrigin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_x_3_0 = null;

        AntlrDatatypeRuleToken lv_y_4_0 = null;

        AntlrDatatypeRuleToken lv_z_5_0 = null;

        AntlrDatatypeRuleToken lv_roll_7_0 = null;

        AntlrDatatypeRuleToken lv_pitch_8_0 = null;

        AntlrDatatypeRuleToken lv_yaw_9_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:904:2: ( (otherlv_0= 'Origin' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'xyz' ( (lv_x_3_0= ruleSIGNED_NUMERIC ) ) ( (lv_y_4_0= ruleSIGNED_NUMERIC ) ) ( (lv_z_5_0= ruleSIGNED_NUMERIC ) ) (otherlv_6= 'roll_pitch_yaw' ( (lv_roll_7_0= ruleSIGNED_NUMERIC ) ) ( (lv_pitch_8_0= ruleSIGNED_NUMERIC ) ) ( (lv_yaw_9_0= ruleSIGNED_NUMERIC ) ) )? ) )
            // InternalDsl.g:905:2: (otherlv_0= 'Origin' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'xyz' ( (lv_x_3_0= ruleSIGNED_NUMERIC ) ) ( (lv_y_4_0= ruleSIGNED_NUMERIC ) ) ( (lv_z_5_0= ruleSIGNED_NUMERIC ) ) (otherlv_6= 'roll_pitch_yaw' ( (lv_roll_7_0= ruleSIGNED_NUMERIC ) ) ( (lv_pitch_8_0= ruleSIGNED_NUMERIC ) ) ( (lv_yaw_9_0= ruleSIGNED_NUMERIC ) ) )? )
            {
            // InternalDsl.g:905:2: (otherlv_0= 'Origin' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'xyz' ( (lv_x_3_0= ruleSIGNED_NUMERIC ) ) ( (lv_y_4_0= ruleSIGNED_NUMERIC ) ) ( (lv_z_5_0= ruleSIGNED_NUMERIC ) ) (otherlv_6= 'roll_pitch_yaw' ( (lv_roll_7_0= ruleSIGNED_NUMERIC ) ) ( (lv_pitch_8_0= ruleSIGNED_NUMERIC ) ) ( (lv_yaw_9_0= ruleSIGNED_NUMERIC ) ) )? )
            // InternalDsl.g:906:3: otherlv_0= 'Origin' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'xyz' ( (lv_x_3_0= ruleSIGNED_NUMERIC ) ) ( (lv_y_4_0= ruleSIGNED_NUMERIC ) ) ( (lv_z_5_0= ruleSIGNED_NUMERIC ) ) (otherlv_6= 'roll_pitch_yaw' ( (lv_roll_7_0= ruleSIGNED_NUMERIC ) ) ( (lv_pitch_8_0= ruleSIGNED_NUMERIC ) ) ( (lv_yaw_9_0= ruleSIGNED_NUMERIC ) ) )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getOriginAccess().getOriginKeyword_0());
            		
            // InternalDsl.g:910:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDsl.g:911:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalDsl.g:911:4: (lv_name_1_0= RULE_ID )
                    // InternalDsl.g:912:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_34); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getOriginAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOriginRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,30,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getOriginAccess().getXyzKeyword_2());
            		
            // InternalDsl.g:932:3: ( (lv_x_3_0= ruleSIGNED_NUMERIC ) )
            // InternalDsl.g:933:4: (lv_x_3_0= ruleSIGNED_NUMERIC )
            {
            // InternalDsl.g:933:4: (lv_x_3_0= ruleSIGNED_NUMERIC )
            // InternalDsl.g:934:5: lv_x_3_0= ruleSIGNED_NUMERIC
            {

            					newCompositeNode(grammarAccess.getOriginAccess().getXSIGNED_NUMERICParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_35);
            lv_x_3_0=ruleSIGNED_NUMERIC();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOriginRule());
            					}
            					set(
            						current,
            						"x",
            						lv_x_3_0,
            						"org.xtext.urdf.Dsl.SIGNED_NUMERIC");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:951:3: ( (lv_y_4_0= ruleSIGNED_NUMERIC ) )
            // InternalDsl.g:952:4: (lv_y_4_0= ruleSIGNED_NUMERIC )
            {
            // InternalDsl.g:952:4: (lv_y_4_0= ruleSIGNED_NUMERIC )
            // InternalDsl.g:953:5: lv_y_4_0= ruleSIGNED_NUMERIC
            {

            					newCompositeNode(grammarAccess.getOriginAccess().getYSIGNED_NUMERICParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_35);
            lv_y_4_0=ruleSIGNED_NUMERIC();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOriginRule());
            					}
            					set(
            						current,
            						"y",
            						lv_y_4_0,
            						"org.xtext.urdf.Dsl.SIGNED_NUMERIC");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:970:3: ( (lv_z_5_0= ruleSIGNED_NUMERIC ) )
            // InternalDsl.g:971:4: (lv_z_5_0= ruleSIGNED_NUMERIC )
            {
            // InternalDsl.g:971:4: (lv_z_5_0= ruleSIGNED_NUMERIC )
            // InternalDsl.g:972:5: lv_z_5_0= ruleSIGNED_NUMERIC
            {

            					newCompositeNode(grammarAccess.getOriginAccess().getZSIGNED_NUMERICParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_36);
            lv_z_5_0=ruleSIGNED_NUMERIC();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOriginRule());
            					}
            					set(
            						current,
            						"z",
            						lv_z_5_0,
            						"org.xtext.urdf.Dsl.SIGNED_NUMERIC");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:989:3: (otherlv_6= 'roll_pitch_yaw' ( (lv_roll_7_0= ruleSIGNED_NUMERIC ) ) ( (lv_pitch_8_0= ruleSIGNED_NUMERIC ) ) ( (lv_yaw_9_0= ruleSIGNED_NUMERIC ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDsl.g:990:4: otherlv_6= 'roll_pitch_yaw' ( (lv_roll_7_0= ruleSIGNED_NUMERIC ) ) ( (lv_pitch_8_0= ruleSIGNED_NUMERIC ) ) ( (lv_yaw_9_0= ruleSIGNED_NUMERIC ) )
                    {
                    otherlv_6=(Token)match(input,31,FOLLOW_35); 

                    				newLeafNode(otherlv_6, grammarAccess.getOriginAccess().getRoll_pitch_yawKeyword_6_0());
                    			
                    // InternalDsl.g:994:4: ( (lv_roll_7_0= ruleSIGNED_NUMERIC ) )
                    // InternalDsl.g:995:5: (lv_roll_7_0= ruleSIGNED_NUMERIC )
                    {
                    // InternalDsl.g:995:5: (lv_roll_7_0= ruleSIGNED_NUMERIC )
                    // InternalDsl.g:996:6: lv_roll_7_0= ruleSIGNED_NUMERIC
                    {

                    						newCompositeNode(grammarAccess.getOriginAccess().getRollSIGNED_NUMERICParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_roll_7_0=ruleSIGNED_NUMERIC();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOriginRule());
                    						}
                    						set(
                    							current,
                    							"roll",
                    							lv_roll_7_0,
                    							"org.xtext.urdf.Dsl.SIGNED_NUMERIC");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:1013:4: ( (lv_pitch_8_0= ruleSIGNED_NUMERIC ) )
                    // InternalDsl.g:1014:5: (lv_pitch_8_0= ruleSIGNED_NUMERIC )
                    {
                    // InternalDsl.g:1014:5: (lv_pitch_8_0= ruleSIGNED_NUMERIC )
                    // InternalDsl.g:1015:6: lv_pitch_8_0= ruleSIGNED_NUMERIC
                    {

                    						newCompositeNode(grammarAccess.getOriginAccess().getPitchSIGNED_NUMERICParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_pitch_8_0=ruleSIGNED_NUMERIC();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOriginRule());
                    						}
                    						set(
                    							current,
                    							"pitch",
                    							lv_pitch_8_0,
                    							"org.xtext.urdf.Dsl.SIGNED_NUMERIC");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:1032:4: ( (lv_yaw_9_0= ruleSIGNED_NUMERIC ) )
                    // InternalDsl.g:1033:5: (lv_yaw_9_0= ruleSIGNED_NUMERIC )
                    {
                    // InternalDsl.g:1033:5: (lv_yaw_9_0= ruleSIGNED_NUMERIC )
                    // InternalDsl.g:1034:6: lv_yaw_9_0= ruleSIGNED_NUMERIC
                    {

                    						newCompositeNode(grammarAccess.getOriginAccess().getYawSIGNED_NUMERICParserRuleCall_6_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_yaw_9_0=ruleSIGNED_NUMERIC();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOriginRule());
                    						}
                    						set(
                    							current,
                    							"yaw",
                    							lv_yaw_9_0,
                    							"org.xtext.urdf.Dsl.SIGNED_NUMERIC");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrigin"


    // $ANTLR start "entryRuleMass"
    // InternalDsl.g:1056:1: entryRuleMass returns [EObject current=null] : iv_ruleMass= ruleMass EOF ;
    public final EObject entryRuleMass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMass = null;


        try {
            // InternalDsl.g:1056:45: (iv_ruleMass= ruleMass EOF )
            // InternalDsl.g:1057:2: iv_ruleMass= ruleMass EOF
            {
             newCompositeNode(grammarAccess.getMassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMass=ruleMass();

            state._fsp--;

             current =iv_ruleMass; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMass"


    // $ANTLR start "ruleMass"
    // InternalDsl.g:1063:1: ruleMass returns [EObject current=null] : (otherlv_0= 'Mass' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'massValueInKilograms' ( (lv_massValueInKilograms_3_0= ruleFLOAT ) ) ) ;
    public final EObject ruleMass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_massValueInKilograms_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1069:2: ( (otherlv_0= 'Mass' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'massValueInKilograms' ( (lv_massValueInKilograms_3_0= ruleFLOAT ) ) ) )
            // InternalDsl.g:1070:2: (otherlv_0= 'Mass' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'massValueInKilograms' ( (lv_massValueInKilograms_3_0= ruleFLOAT ) ) )
            {
            // InternalDsl.g:1070:2: (otherlv_0= 'Mass' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'massValueInKilograms' ( (lv_massValueInKilograms_3_0= ruleFLOAT ) ) )
            // InternalDsl.g:1071:3: otherlv_0= 'Mass' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'massValueInKilograms' ( (lv_massValueInKilograms_3_0= ruleFLOAT ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_37); 

            			newLeafNode(otherlv_0, grammarAccess.getMassAccess().getMassKeyword_0());
            		
            // InternalDsl.g:1075:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDsl.g:1076:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalDsl.g:1076:4: (lv_name_1_0= RULE_ID )
                    // InternalDsl.g:1077:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_38); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getMassAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMassRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,33,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getMassAccess().getMassValueInKilogramsKeyword_2());
            		
            // InternalDsl.g:1097:3: ( (lv_massValueInKilograms_3_0= ruleFLOAT ) )
            // InternalDsl.g:1098:4: (lv_massValueInKilograms_3_0= ruleFLOAT )
            {
            // InternalDsl.g:1098:4: (lv_massValueInKilograms_3_0= ruleFLOAT )
            // InternalDsl.g:1099:5: lv_massValueInKilograms_3_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getMassAccess().getMassValueInKilogramsFLOATParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_massValueInKilograms_3_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMassRule());
            					}
            					set(
            						current,
            						"massValueInKilograms",
            						lv_massValueInKilograms_3_0,
            						"org.xtext.urdf.Dsl.FLOAT");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMass"


    // $ANTLR start "entryRuleInertia"
    // InternalDsl.g:1120:1: entryRuleInertia returns [EObject current=null] : iv_ruleInertia= ruleInertia EOF ;
    public final EObject entryRuleInertia() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInertia = null;


        try {
            // InternalDsl.g:1120:48: (iv_ruleInertia= ruleInertia EOF )
            // InternalDsl.g:1121:2: iv_ruleInertia= ruleInertia EOF
            {
             newCompositeNode(grammarAccess.getInertiaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInertia=ruleInertia();

            state._fsp--;

             current =iv_ruleInertia; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInertia"


    // $ANTLR start "ruleInertia"
    // InternalDsl.g:1127:1: ruleInertia returns [EObject current=null] : (otherlv_0= 'Inertia' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'ixx' ( (lv_ixx_3_0= ruleSIGNED_NUMERIC ) ) otherlv_4= 'ixy' ( (lv_ixy_5_0= ruleSIGNED_NUMERIC ) ) otherlv_6= 'ixz' ( (lv_ixz_7_0= ruleSIGNED_NUMERIC ) ) otherlv_8= 'iyy' ( (lv_iyy_9_0= ruleSIGNED_NUMERIC ) ) otherlv_10= 'iyz' ( (lv_iyz_11_0= ruleSIGNED_NUMERIC ) ) otherlv_12= 'izz' ( (lv_izz_13_0= ruleSIGNED_NUMERIC ) ) ) ;
    public final EObject ruleInertia() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_ixx_3_0 = null;

        AntlrDatatypeRuleToken lv_ixy_5_0 = null;

        AntlrDatatypeRuleToken lv_ixz_7_0 = null;

        AntlrDatatypeRuleToken lv_iyy_9_0 = null;

        AntlrDatatypeRuleToken lv_iyz_11_0 = null;

        AntlrDatatypeRuleToken lv_izz_13_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1133:2: ( (otherlv_0= 'Inertia' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'ixx' ( (lv_ixx_3_0= ruleSIGNED_NUMERIC ) ) otherlv_4= 'ixy' ( (lv_ixy_5_0= ruleSIGNED_NUMERIC ) ) otherlv_6= 'ixz' ( (lv_ixz_7_0= ruleSIGNED_NUMERIC ) ) otherlv_8= 'iyy' ( (lv_iyy_9_0= ruleSIGNED_NUMERIC ) ) otherlv_10= 'iyz' ( (lv_iyz_11_0= ruleSIGNED_NUMERIC ) ) otherlv_12= 'izz' ( (lv_izz_13_0= ruleSIGNED_NUMERIC ) ) ) )
            // InternalDsl.g:1134:2: (otherlv_0= 'Inertia' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'ixx' ( (lv_ixx_3_0= ruleSIGNED_NUMERIC ) ) otherlv_4= 'ixy' ( (lv_ixy_5_0= ruleSIGNED_NUMERIC ) ) otherlv_6= 'ixz' ( (lv_ixz_7_0= ruleSIGNED_NUMERIC ) ) otherlv_8= 'iyy' ( (lv_iyy_9_0= ruleSIGNED_NUMERIC ) ) otherlv_10= 'iyz' ( (lv_iyz_11_0= ruleSIGNED_NUMERIC ) ) otherlv_12= 'izz' ( (lv_izz_13_0= ruleSIGNED_NUMERIC ) ) )
            {
            // InternalDsl.g:1134:2: (otherlv_0= 'Inertia' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'ixx' ( (lv_ixx_3_0= ruleSIGNED_NUMERIC ) ) otherlv_4= 'ixy' ( (lv_ixy_5_0= ruleSIGNED_NUMERIC ) ) otherlv_6= 'ixz' ( (lv_ixz_7_0= ruleSIGNED_NUMERIC ) ) otherlv_8= 'iyy' ( (lv_iyy_9_0= ruleSIGNED_NUMERIC ) ) otherlv_10= 'iyz' ( (lv_iyz_11_0= ruleSIGNED_NUMERIC ) ) otherlv_12= 'izz' ( (lv_izz_13_0= ruleSIGNED_NUMERIC ) ) )
            // InternalDsl.g:1135:3: otherlv_0= 'Inertia' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'ixx' ( (lv_ixx_3_0= ruleSIGNED_NUMERIC ) ) otherlv_4= 'ixy' ( (lv_ixy_5_0= ruleSIGNED_NUMERIC ) ) otherlv_6= 'ixz' ( (lv_ixz_7_0= ruleSIGNED_NUMERIC ) ) otherlv_8= 'iyy' ( (lv_iyy_9_0= ruleSIGNED_NUMERIC ) ) otherlv_10= 'iyz' ( (lv_iyz_11_0= ruleSIGNED_NUMERIC ) ) otherlv_12= 'izz' ( (lv_izz_13_0= ruleSIGNED_NUMERIC ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_40); 

            			newLeafNode(otherlv_0, grammarAccess.getInertiaAccess().getInertiaKeyword_0());
            		
            // InternalDsl.g:1139:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDsl.g:1140:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalDsl.g:1140:4: (lv_name_1_0= RULE_ID )
                    // InternalDsl.g:1141:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_41); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getInertiaAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInertiaRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,35,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getInertiaAccess().getIxxKeyword_2());
            		
            // InternalDsl.g:1161:3: ( (lv_ixx_3_0= ruleSIGNED_NUMERIC ) )
            // InternalDsl.g:1162:4: (lv_ixx_3_0= ruleSIGNED_NUMERIC )
            {
            // InternalDsl.g:1162:4: (lv_ixx_3_0= ruleSIGNED_NUMERIC )
            // InternalDsl.g:1163:5: lv_ixx_3_0= ruleSIGNED_NUMERIC
            {

            					newCompositeNode(grammarAccess.getInertiaAccess().getIxxSIGNED_NUMERICParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_42);
            lv_ixx_3_0=ruleSIGNED_NUMERIC();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInertiaRule());
            					}
            					set(
            						current,
            						"ixx",
            						lv_ixx_3_0,
            						"org.xtext.urdf.Dsl.SIGNED_NUMERIC");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,36,FOLLOW_35); 

            			newLeafNode(otherlv_4, grammarAccess.getInertiaAccess().getIxyKeyword_4());
            		
            // InternalDsl.g:1184:3: ( (lv_ixy_5_0= ruleSIGNED_NUMERIC ) )
            // InternalDsl.g:1185:4: (lv_ixy_5_0= ruleSIGNED_NUMERIC )
            {
            // InternalDsl.g:1185:4: (lv_ixy_5_0= ruleSIGNED_NUMERIC )
            // InternalDsl.g:1186:5: lv_ixy_5_0= ruleSIGNED_NUMERIC
            {

            					newCompositeNode(grammarAccess.getInertiaAccess().getIxySIGNED_NUMERICParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_43);
            lv_ixy_5_0=ruleSIGNED_NUMERIC();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInertiaRule());
            					}
            					set(
            						current,
            						"ixy",
            						lv_ixy_5_0,
            						"org.xtext.urdf.Dsl.SIGNED_NUMERIC");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,37,FOLLOW_35); 

            			newLeafNode(otherlv_6, grammarAccess.getInertiaAccess().getIxzKeyword_6());
            		
            // InternalDsl.g:1207:3: ( (lv_ixz_7_0= ruleSIGNED_NUMERIC ) )
            // InternalDsl.g:1208:4: (lv_ixz_7_0= ruleSIGNED_NUMERIC )
            {
            // InternalDsl.g:1208:4: (lv_ixz_7_0= ruleSIGNED_NUMERIC )
            // InternalDsl.g:1209:5: lv_ixz_7_0= ruleSIGNED_NUMERIC
            {

            					newCompositeNode(grammarAccess.getInertiaAccess().getIxzSIGNED_NUMERICParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_44);
            lv_ixz_7_0=ruleSIGNED_NUMERIC();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInertiaRule());
            					}
            					set(
            						current,
            						"ixz",
            						lv_ixz_7_0,
            						"org.xtext.urdf.Dsl.SIGNED_NUMERIC");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,38,FOLLOW_35); 

            			newLeafNode(otherlv_8, grammarAccess.getInertiaAccess().getIyyKeyword_8());
            		
            // InternalDsl.g:1230:3: ( (lv_iyy_9_0= ruleSIGNED_NUMERIC ) )
            // InternalDsl.g:1231:4: (lv_iyy_9_0= ruleSIGNED_NUMERIC )
            {
            // InternalDsl.g:1231:4: (lv_iyy_9_0= ruleSIGNED_NUMERIC )
            // InternalDsl.g:1232:5: lv_iyy_9_0= ruleSIGNED_NUMERIC
            {

            					newCompositeNode(grammarAccess.getInertiaAccess().getIyySIGNED_NUMERICParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_45);
            lv_iyy_9_0=ruleSIGNED_NUMERIC();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInertiaRule());
            					}
            					set(
            						current,
            						"iyy",
            						lv_iyy_9_0,
            						"org.xtext.urdf.Dsl.SIGNED_NUMERIC");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,39,FOLLOW_35); 

            			newLeafNode(otherlv_10, grammarAccess.getInertiaAccess().getIyzKeyword_10());
            		
            // InternalDsl.g:1253:3: ( (lv_iyz_11_0= ruleSIGNED_NUMERIC ) )
            // InternalDsl.g:1254:4: (lv_iyz_11_0= ruleSIGNED_NUMERIC )
            {
            // InternalDsl.g:1254:4: (lv_iyz_11_0= ruleSIGNED_NUMERIC )
            // InternalDsl.g:1255:5: lv_iyz_11_0= ruleSIGNED_NUMERIC
            {

            					newCompositeNode(grammarAccess.getInertiaAccess().getIyzSIGNED_NUMERICParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_46);
            lv_iyz_11_0=ruleSIGNED_NUMERIC();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInertiaRule());
            					}
            					set(
            						current,
            						"iyz",
            						lv_iyz_11_0,
            						"org.xtext.urdf.Dsl.SIGNED_NUMERIC");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,40,FOLLOW_35); 

            			newLeafNode(otherlv_12, grammarAccess.getInertiaAccess().getIzzKeyword_12());
            		
            // InternalDsl.g:1276:3: ( (lv_izz_13_0= ruleSIGNED_NUMERIC ) )
            // InternalDsl.g:1277:4: (lv_izz_13_0= ruleSIGNED_NUMERIC )
            {
            // InternalDsl.g:1277:4: (lv_izz_13_0= ruleSIGNED_NUMERIC )
            // InternalDsl.g:1278:5: lv_izz_13_0= ruleSIGNED_NUMERIC
            {

            					newCompositeNode(grammarAccess.getInertiaAccess().getIzzSIGNED_NUMERICParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_2);
            lv_izz_13_0=ruleSIGNED_NUMERIC();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInertiaRule());
            					}
            					set(
            						current,
            						"izz",
            						lv_izz_13_0,
            						"org.xtext.urdf.Dsl.SIGNED_NUMERIC");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInertia"


    // $ANTLR start "entryRuleColor"
    // InternalDsl.g:1299:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // InternalDsl.g:1299:46: (iv_ruleColor= ruleColor EOF )
            // InternalDsl.g:1300:2: iv_ruleColor= ruleColor EOF
            {
             newCompositeNode(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColor=ruleColor();

            state._fsp--;

             current =iv_ruleColor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // InternalDsl.g:1306:1: ruleColor returns [EObject current=null] : (otherlv_0= 'Color' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'red_green_blue_alpha' ( (lv_red_3_0= ruleFLOAT ) ) ( (lv_green_4_0= ruleFLOAT ) ) ( (lv_blue_5_0= ruleFLOAT ) ) ( (lv_alpha_6_0= ruleFLOAT ) ) ) ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_red_3_0 = null;

        AntlrDatatypeRuleToken lv_green_4_0 = null;

        AntlrDatatypeRuleToken lv_blue_5_0 = null;

        AntlrDatatypeRuleToken lv_alpha_6_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1312:2: ( (otherlv_0= 'Color' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'red_green_blue_alpha' ( (lv_red_3_0= ruleFLOAT ) ) ( (lv_green_4_0= ruleFLOAT ) ) ( (lv_blue_5_0= ruleFLOAT ) ) ( (lv_alpha_6_0= ruleFLOAT ) ) ) )
            // InternalDsl.g:1313:2: (otherlv_0= 'Color' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'red_green_blue_alpha' ( (lv_red_3_0= ruleFLOAT ) ) ( (lv_green_4_0= ruleFLOAT ) ) ( (lv_blue_5_0= ruleFLOAT ) ) ( (lv_alpha_6_0= ruleFLOAT ) ) )
            {
            // InternalDsl.g:1313:2: (otherlv_0= 'Color' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'red_green_blue_alpha' ( (lv_red_3_0= ruleFLOAT ) ) ( (lv_green_4_0= ruleFLOAT ) ) ( (lv_blue_5_0= ruleFLOAT ) ) ( (lv_alpha_6_0= ruleFLOAT ) ) )
            // InternalDsl.g:1314:3: otherlv_0= 'Color' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'red_green_blue_alpha' ( (lv_red_3_0= ruleFLOAT ) ) ( (lv_green_4_0= ruleFLOAT ) ) ( (lv_blue_5_0= ruleFLOAT ) ) ( (lv_alpha_6_0= ruleFLOAT ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_47); 

            			newLeafNode(otherlv_0, grammarAccess.getColorAccess().getColorKeyword_0());
            		
            // InternalDsl.g:1318:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDsl.g:1319:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalDsl.g:1319:4: (lv_name_1_0= RULE_ID )
                    // InternalDsl.g:1320:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_48); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getColorAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getColorRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,42,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getColorAccess().getRed_green_blue_alphaKeyword_2());
            		
            // InternalDsl.g:1340:3: ( (lv_red_3_0= ruleFLOAT ) )
            // InternalDsl.g:1341:4: (lv_red_3_0= ruleFLOAT )
            {
            // InternalDsl.g:1341:4: (lv_red_3_0= ruleFLOAT )
            // InternalDsl.g:1342:5: lv_red_3_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getColorAccess().getRedFLOATParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_39);
            lv_red_3_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColorRule());
            					}
            					set(
            						current,
            						"red",
            						lv_red_3_0,
            						"org.xtext.urdf.Dsl.FLOAT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:1359:3: ( (lv_green_4_0= ruleFLOAT ) )
            // InternalDsl.g:1360:4: (lv_green_4_0= ruleFLOAT )
            {
            // InternalDsl.g:1360:4: (lv_green_4_0= ruleFLOAT )
            // InternalDsl.g:1361:5: lv_green_4_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getColorAccess().getGreenFLOATParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_39);
            lv_green_4_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColorRule());
            					}
            					set(
            						current,
            						"green",
            						lv_green_4_0,
            						"org.xtext.urdf.Dsl.FLOAT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:1378:3: ( (lv_blue_5_0= ruleFLOAT ) )
            // InternalDsl.g:1379:4: (lv_blue_5_0= ruleFLOAT )
            {
            // InternalDsl.g:1379:4: (lv_blue_5_0= ruleFLOAT )
            // InternalDsl.g:1380:5: lv_blue_5_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getColorAccess().getBlueFLOATParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_39);
            lv_blue_5_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColorRule());
            					}
            					set(
            						current,
            						"blue",
            						lv_blue_5_0,
            						"org.xtext.urdf.Dsl.FLOAT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:1397:3: ( (lv_alpha_6_0= ruleFLOAT ) )
            // InternalDsl.g:1398:4: (lv_alpha_6_0= ruleFLOAT )
            {
            // InternalDsl.g:1398:4: (lv_alpha_6_0= ruleFLOAT )
            // InternalDsl.g:1399:5: lv_alpha_6_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getColorAccess().getAlphaFLOATParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_alpha_6_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColorRule());
            					}
            					set(
            						current,
            						"alpha",
            						lv_alpha_6_0,
            						"org.xtext.urdf.Dsl.FLOAT");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleTexture"
    // InternalDsl.g:1420:1: entryRuleTexture returns [EObject current=null] : iv_ruleTexture= ruleTexture EOF ;
    public final EObject entryRuleTexture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTexture = null;


        try {
            // InternalDsl.g:1420:48: (iv_ruleTexture= ruleTexture EOF )
            // InternalDsl.g:1421:2: iv_ruleTexture= ruleTexture EOF
            {
             newCompositeNode(grammarAccess.getTextureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTexture=ruleTexture();

            state._fsp--;

             current =iv_ruleTexture; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTexture"


    // $ANTLR start "ruleTexture"
    // InternalDsl.g:1427:1: ruleTexture returns [EObject current=null] : (otherlv_0= 'Texture' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleTexture() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_pathToFile_3_0=null;


        	enterRule();

        try {
            // InternalDsl.g:1433:2: ( (otherlv_0= 'Texture' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= RULE_STRING ) ) ) )
            // InternalDsl.g:1434:2: (otherlv_0= 'Texture' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= RULE_STRING ) ) )
            {
            // InternalDsl.g:1434:2: (otherlv_0= 'Texture' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= RULE_STRING ) ) )
            // InternalDsl.g:1435:3: otherlv_0= 'Texture' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_49); 

            			newLeafNode(otherlv_0, grammarAccess.getTextureAccess().getTextureKeyword_0());
            		
            // InternalDsl.g:1439:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDsl.g:1440:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalDsl.g:1440:4: (lv_name_1_0= RULE_ID )
                    // InternalDsl.g:1441:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_50); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getTextureAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTextureRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,44,FOLLOW_51); 

            			newLeafNode(otherlv_2, grammarAccess.getTextureAccess().getPathToFileKeyword_2());
            		
            // InternalDsl.g:1461:3: ( (lv_pathToFile_3_0= RULE_STRING ) )
            // InternalDsl.g:1462:4: (lv_pathToFile_3_0= RULE_STRING )
            {
            // InternalDsl.g:1462:4: (lv_pathToFile_3_0= RULE_STRING )
            // InternalDsl.g:1463:5: lv_pathToFile_3_0= RULE_STRING
            {
            lv_pathToFile_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_pathToFile_3_0, grammarAccess.getTextureAccess().getPathToFileSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"pathToFile",
            						lv_pathToFile_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTexture"


    // $ANTLR start "entryRuleBox"
    // InternalDsl.g:1483:1: entryRuleBox returns [EObject current=null] : iv_ruleBox= ruleBox EOF ;
    public final EObject entryRuleBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBox = null;


        try {
            // InternalDsl.g:1483:44: (iv_ruleBox= ruleBox EOF )
            // InternalDsl.g:1484:2: iv_ruleBox= ruleBox EOF
            {
             newCompositeNode(grammarAccess.getBoxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBox=ruleBox();

            state._fsp--;

             current =iv_ruleBox; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBox"


    // $ANTLR start "ruleBox"
    // InternalDsl.g:1490:1: ruleBox returns [EObject current=null] : (otherlv_0= 'Box' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'height_length_width' ( (lv_height_3_0= ruleMEASURE ) ) ( (lv_length_4_0= ruleMEASURE ) ) ( (lv_width_5_0= ruleMEASURE ) ) ) ;
    public final EObject ruleBox() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_height_3_0 = null;

        AntlrDatatypeRuleToken lv_length_4_0 = null;

        AntlrDatatypeRuleToken lv_width_5_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1496:2: ( (otherlv_0= 'Box' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'height_length_width' ( (lv_height_3_0= ruleMEASURE ) ) ( (lv_length_4_0= ruleMEASURE ) ) ( (lv_width_5_0= ruleMEASURE ) ) ) )
            // InternalDsl.g:1497:2: (otherlv_0= 'Box' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'height_length_width' ( (lv_height_3_0= ruleMEASURE ) ) ( (lv_length_4_0= ruleMEASURE ) ) ( (lv_width_5_0= ruleMEASURE ) ) )
            {
            // InternalDsl.g:1497:2: (otherlv_0= 'Box' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'height_length_width' ( (lv_height_3_0= ruleMEASURE ) ) ( (lv_length_4_0= ruleMEASURE ) ) ( (lv_width_5_0= ruleMEASURE ) ) )
            // InternalDsl.g:1498:3: otherlv_0= 'Box' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'height_length_width' ( (lv_height_3_0= ruleMEASURE ) ) ( (lv_length_4_0= ruleMEASURE ) ) ( (lv_width_5_0= ruleMEASURE ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_52); 

            			newLeafNode(otherlv_0, grammarAccess.getBoxAccess().getBoxKeyword_0());
            		
            // InternalDsl.g:1502:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalDsl.g:1503:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalDsl.g:1503:4: (lv_name_1_0= RULE_ID )
                    // InternalDsl.g:1504:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_53); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getBoxAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBoxRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,46,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getBoxAccess().getHeight_length_widthKeyword_2());
            		
            // InternalDsl.g:1524:3: ( (lv_height_3_0= ruleMEASURE ) )
            // InternalDsl.g:1525:4: (lv_height_3_0= ruleMEASURE )
            {
            // InternalDsl.g:1525:4: (lv_height_3_0= ruleMEASURE )
            // InternalDsl.g:1526:5: lv_height_3_0= ruleMEASURE
            {

            					newCompositeNode(grammarAccess.getBoxAccess().getHeightMEASUREParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_39);
            lv_height_3_0=ruleMEASURE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBoxRule());
            					}
            					set(
            						current,
            						"height",
            						lv_height_3_0,
            						"org.xtext.urdf.Dsl.MEASURE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:1543:3: ( (lv_length_4_0= ruleMEASURE ) )
            // InternalDsl.g:1544:4: (lv_length_4_0= ruleMEASURE )
            {
            // InternalDsl.g:1544:4: (lv_length_4_0= ruleMEASURE )
            // InternalDsl.g:1545:5: lv_length_4_0= ruleMEASURE
            {

            					newCompositeNode(grammarAccess.getBoxAccess().getLengthMEASUREParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_39);
            lv_length_4_0=ruleMEASURE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBoxRule());
            					}
            					set(
            						current,
            						"length",
            						lv_length_4_0,
            						"org.xtext.urdf.Dsl.MEASURE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:1562:3: ( (lv_width_5_0= ruleMEASURE ) )
            // InternalDsl.g:1563:4: (lv_width_5_0= ruleMEASURE )
            {
            // InternalDsl.g:1563:4: (lv_width_5_0= ruleMEASURE )
            // InternalDsl.g:1564:5: lv_width_5_0= ruleMEASURE
            {

            					newCompositeNode(grammarAccess.getBoxAccess().getWidthMEASUREParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_width_5_0=ruleMEASURE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBoxRule());
            					}
            					set(
            						current,
            						"width",
            						lv_width_5_0,
            						"org.xtext.urdf.Dsl.MEASURE");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBox"


    // $ANTLR start "entryRuleCylinder"
    // InternalDsl.g:1585:1: entryRuleCylinder returns [EObject current=null] : iv_ruleCylinder= ruleCylinder EOF ;
    public final EObject entryRuleCylinder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCylinder = null;


        try {
            // InternalDsl.g:1585:49: (iv_ruleCylinder= ruleCylinder EOF )
            // InternalDsl.g:1586:2: iv_ruleCylinder= ruleCylinder EOF
            {
             newCompositeNode(grammarAccess.getCylinderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCylinder=ruleCylinder();

            state._fsp--;

             current =iv_ruleCylinder; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCylinder"


    // $ANTLR start "ruleCylinder"
    // InternalDsl.g:1592:1: ruleCylinder returns [EObject current=null] : (otherlv_0= 'Cylinder' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'radius' ( (lv_radius_3_0= ruleMEASURE ) ) otherlv_4= 'length' ( (lv_length_5_0= ruleMEASURE ) ) ) ;
    public final EObject ruleCylinder() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_radius_3_0 = null;

        AntlrDatatypeRuleToken lv_length_5_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1598:2: ( (otherlv_0= 'Cylinder' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'radius' ( (lv_radius_3_0= ruleMEASURE ) ) otherlv_4= 'length' ( (lv_length_5_0= ruleMEASURE ) ) ) )
            // InternalDsl.g:1599:2: (otherlv_0= 'Cylinder' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'radius' ( (lv_radius_3_0= ruleMEASURE ) ) otherlv_4= 'length' ( (lv_length_5_0= ruleMEASURE ) ) )
            {
            // InternalDsl.g:1599:2: (otherlv_0= 'Cylinder' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'radius' ( (lv_radius_3_0= ruleMEASURE ) ) otherlv_4= 'length' ( (lv_length_5_0= ruleMEASURE ) ) )
            // InternalDsl.g:1600:3: otherlv_0= 'Cylinder' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'radius' ( (lv_radius_3_0= ruleMEASURE ) ) otherlv_4= 'length' ( (lv_length_5_0= ruleMEASURE ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_54); 

            			newLeafNode(otherlv_0, grammarAccess.getCylinderAccess().getCylinderKeyword_0());
            		
            // InternalDsl.g:1604:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalDsl.g:1605:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalDsl.g:1605:4: (lv_name_1_0= RULE_ID )
                    // InternalDsl.g:1606:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_55); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getCylinderAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCylinderRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,48,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getCylinderAccess().getRadiusKeyword_2());
            		
            // InternalDsl.g:1626:3: ( (lv_radius_3_0= ruleMEASURE ) )
            // InternalDsl.g:1627:4: (lv_radius_3_0= ruleMEASURE )
            {
            // InternalDsl.g:1627:4: (lv_radius_3_0= ruleMEASURE )
            // InternalDsl.g:1628:5: lv_radius_3_0= ruleMEASURE
            {

            					newCompositeNode(grammarAccess.getCylinderAccess().getRadiusMEASUREParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_56);
            lv_radius_3_0=ruleMEASURE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCylinderRule());
            					}
            					set(
            						current,
            						"radius",
            						lv_radius_3_0,
            						"org.xtext.urdf.Dsl.MEASURE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,49,FOLLOW_39); 

            			newLeafNode(otherlv_4, grammarAccess.getCylinderAccess().getLengthKeyword_4());
            		
            // InternalDsl.g:1649:3: ( (lv_length_5_0= ruleMEASURE ) )
            // InternalDsl.g:1650:4: (lv_length_5_0= ruleMEASURE )
            {
            // InternalDsl.g:1650:4: (lv_length_5_0= ruleMEASURE )
            // InternalDsl.g:1651:5: lv_length_5_0= ruleMEASURE
            {

            					newCompositeNode(grammarAccess.getCylinderAccess().getLengthMEASUREParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_length_5_0=ruleMEASURE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCylinderRule());
            					}
            					set(
            						current,
            						"length",
            						lv_length_5_0,
            						"org.xtext.urdf.Dsl.MEASURE");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCylinder"


    // $ANTLR start "entryRuleMesh"
    // InternalDsl.g:1672:1: entryRuleMesh returns [EObject current=null] : iv_ruleMesh= ruleMesh EOF ;
    public final EObject entryRuleMesh() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMesh = null;


        try {
            // InternalDsl.g:1672:45: (iv_ruleMesh= ruleMesh EOF )
            // InternalDsl.g:1673:2: iv_ruleMesh= ruleMesh EOF
            {
             newCompositeNode(grammarAccess.getMeshRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMesh=ruleMesh();

            state._fsp--;

             current =iv_ruleMesh; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMesh"


    // $ANTLR start "ruleMesh"
    // InternalDsl.g:1679:1: ruleMesh returns [EObject current=null] : (otherlv_0= 'Mesh' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= RULE_STRING ) ) (otherlv_4= 'scale' ( (otherlv_5= RULE_STRING ) ) )? ) ;
    public final EObject ruleMesh() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_pathToFile_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalDsl.g:1685:2: ( (otherlv_0= 'Mesh' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= RULE_STRING ) ) (otherlv_4= 'scale' ( (otherlv_5= RULE_STRING ) ) )? ) )
            // InternalDsl.g:1686:2: (otherlv_0= 'Mesh' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= RULE_STRING ) ) (otherlv_4= 'scale' ( (otherlv_5= RULE_STRING ) ) )? )
            {
            // InternalDsl.g:1686:2: (otherlv_0= 'Mesh' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= RULE_STRING ) ) (otherlv_4= 'scale' ( (otherlv_5= RULE_STRING ) ) )? )
            // InternalDsl.g:1687:3: otherlv_0= 'Mesh' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= RULE_STRING ) ) (otherlv_4= 'scale' ( (otherlv_5= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,50,FOLLOW_49); 

            			newLeafNode(otherlv_0, grammarAccess.getMeshAccess().getMeshKeyword_0());
            		
            // InternalDsl.g:1691:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalDsl.g:1692:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalDsl.g:1692:4: (lv_name_1_0= RULE_ID )
                    // InternalDsl.g:1693:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_50); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getMeshAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMeshRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,44,FOLLOW_51); 

            			newLeafNode(otherlv_2, grammarAccess.getMeshAccess().getPathToFileKeyword_2());
            		
            // InternalDsl.g:1713:3: ( (lv_pathToFile_3_0= RULE_STRING ) )
            // InternalDsl.g:1714:4: (lv_pathToFile_3_0= RULE_STRING )
            {
            // InternalDsl.g:1714:4: (lv_pathToFile_3_0= RULE_STRING )
            // InternalDsl.g:1715:5: lv_pathToFile_3_0= RULE_STRING
            {
            lv_pathToFile_3_0=(Token)match(input,RULE_STRING,FOLLOW_57); 

            					newLeafNode(lv_pathToFile_3_0, grammarAccess.getMeshAccess().getPathToFileSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMeshRule());
            					}
            					setWithLastConsumed(
            						current,
            						"pathToFile",
            						lv_pathToFile_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalDsl.g:1731:3: (otherlv_4= 'scale' ( (otherlv_5= RULE_STRING ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==51) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalDsl.g:1732:4: otherlv_4= 'scale' ( (otherlv_5= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,51,FOLLOW_51); 

                    				newLeafNode(otherlv_4, grammarAccess.getMeshAccess().getScaleKeyword_4_0());
                    			
                    // InternalDsl.g:1736:4: ( (otherlv_5= RULE_STRING ) )
                    // InternalDsl.g:1737:5: (otherlv_5= RULE_STRING )
                    {
                    // InternalDsl.g:1737:5: (otherlv_5= RULE_STRING )
                    // InternalDsl.g:1738:6: otherlv_5= RULE_STRING
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMeshRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(otherlv_5, grammarAccess.getMeshAccess().getBoxBoxCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMesh"


    // $ANTLR start "entryRuleSphere"
    // InternalDsl.g:1754:1: entryRuleSphere returns [EObject current=null] : iv_ruleSphere= ruleSphere EOF ;
    public final EObject entryRuleSphere() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSphere = null;


        try {
            // InternalDsl.g:1754:47: (iv_ruleSphere= ruleSphere EOF )
            // InternalDsl.g:1755:2: iv_ruleSphere= ruleSphere EOF
            {
             newCompositeNode(grammarAccess.getSphereRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSphere=ruleSphere();

            state._fsp--;

             current =iv_ruleSphere; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSphere"


    // $ANTLR start "ruleSphere"
    // InternalDsl.g:1761:1: ruleSphere returns [EObject current=null] : (otherlv_0= 'Sphere' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'radius' ( (lv_radius_3_0= ruleMEASURE ) ) ) ;
    public final EObject ruleSphere() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_radius_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1767:2: ( (otherlv_0= 'Sphere' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'radius' ( (lv_radius_3_0= ruleMEASURE ) ) ) )
            // InternalDsl.g:1768:2: (otherlv_0= 'Sphere' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'radius' ( (lv_radius_3_0= ruleMEASURE ) ) )
            {
            // InternalDsl.g:1768:2: (otherlv_0= 'Sphere' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'radius' ( (lv_radius_3_0= ruleMEASURE ) ) )
            // InternalDsl.g:1769:3: otherlv_0= 'Sphere' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'radius' ( (lv_radius_3_0= ruleMEASURE ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_54); 

            			newLeafNode(otherlv_0, grammarAccess.getSphereAccess().getSphereKeyword_0());
            		
            // InternalDsl.g:1773:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalDsl.g:1774:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalDsl.g:1774:4: (lv_name_1_0= RULE_ID )
                    // InternalDsl.g:1775:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_55); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getSphereAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSphereRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,48,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getSphereAccess().getRadiusKeyword_2());
            		
            // InternalDsl.g:1795:3: ( (lv_radius_3_0= ruleMEASURE ) )
            // InternalDsl.g:1796:4: (lv_radius_3_0= ruleMEASURE )
            {
            // InternalDsl.g:1796:4: (lv_radius_3_0= ruleMEASURE )
            // InternalDsl.g:1797:5: lv_radius_3_0= ruleMEASURE
            {

            					newCompositeNode(grammarAccess.getSphereAccess().getRadiusMEASUREParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_radius_3_0=ruleMEASURE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSphereRule());
            					}
            					set(
            						current,
            						"radius",
            						lv_radius_3_0,
            						"org.xtext.urdf.Dsl.MEASURE");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSphere"


    // $ANTLR start "entryRuleLimit"
    // InternalDsl.g:1818:1: entryRuleLimit returns [EObject current=null] : iv_ruleLimit= ruleLimit EOF ;
    public final EObject entryRuleLimit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLimit = null;


        try {
            // InternalDsl.g:1818:46: (iv_ruleLimit= ruleLimit EOF )
            // InternalDsl.g:1819:2: iv_ruleLimit= ruleLimit EOF
            {
             newCompositeNode(grammarAccess.getLimitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLimit=ruleLimit();

            state._fsp--;

             current =iv_ruleLimit; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLimit"


    // $ANTLR start "ruleLimit"
    // InternalDsl.g:1825:1: ruleLimit returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) )? otherlv_1= 'effort' ( (lv_effort_2_0= ruleSIGNED_NUMERIC ) ) otherlv_3= 'velocity' ( (lv_velocity_4_0= ruleSIGNED_NUMERIC ) ) otherlv_5= 'lower' ( (lv_lower_6_0= ruleSIGNED_NUMERIC ) )? otherlv_7= 'upper' ( (lv_upper_8_0= ruleSIGNED_NUMERIC ) )? ) ;
    public final EObject ruleLimit() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_effort_2_0 = null;

        AntlrDatatypeRuleToken lv_velocity_4_0 = null;

        AntlrDatatypeRuleToken lv_lower_6_0 = null;

        AntlrDatatypeRuleToken lv_upper_8_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1831:2: ( ( ( (lv_name_0_0= RULE_ID ) )? otherlv_1= 'effort' ( (lv_effort_2_0= ruleSIGNED_NUMERIC ) ) otherlv_3= 'velocity' ( (lv_velocity_4_0= ruleSIGNED_NUMERIC ) ) otherlv_5= 'lower' ( (lv_lower_6_0= ruleSIGNED_NUMERIC ) )? otherlv_7= 'upper' ( (lv_upper_8_0= ruleSIGNED_NUMERIC ) )? ) )
            // InternalDsl.g:1832:2: ( ( (lv_name_0_0= RULE_ID ) )? otherlv_1= 'effort' ( (lv_effort_2_0= ruleSIGNED_NUMERIC ) ) otherlv_3= 'velocity' ( (lv_velocity_4_0= ruleSIGNED_NUMERIC ) ) otherlv_5= 'lower' ( (lv_lower_6_0= ruleSIGNED_NUMERIC ) )? otherlv_7= 'upper' ( (lv_upper_8_0= ruleSIGNED_NUMERIC ) )? )
            {
            // InternalDsl.g:1832:2: ( ( (lv_name_0_0= RULE_ID ) )? otherlv_1= 'effort' ( (lv_effort_2_0= ruleSIGNED_NUMERIC ) ) otherlv_3= 'velocity' ( (lv_velocity_4_0= ruleSIGNED_NUMERIC ) ) otherlv_5= 'lower' ( (lv_lower_6_0= ruleSIGNED_NUMERIC ) )? otherlv_7= 'upper' ( (lv_upper_8_0= ruleSIGNED_NUMERIC ) )? )
            // InternalDsl.g:1833:3: ( (lv_name_0_0= RULE_ID ) )? otherlv_1= 'effort' ( (lv_effort_2_0= ruleSIGNED_NUMERIC ) ) otherlv_3= 'velocity' ( (lv_velocity_4_0= ruleSIGNED_NUMERIC ) ) otherlv_5= 'lower' ( (lv_lower_6_0= ruleSIGNED_NUMERIC ) )? otherlv_7= 'upper' ( (lv_upper_8_0= ruleSIGNED_NUMERIC ) )?
            {
            // InternalDsl.g:1833:3: ( (lv_name_0_0= RULE_ID ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalDsl.g:1834:4: (lv_name_0_0= RULE_ID )
                    {
                    // InternalDsl.g:1834:4: (lv_name_0_0= RULE_ID )
                    // InternalDsl.g:1835:5: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_58); 

                    					newLeafNode(lv_name_0_0, grammarAccess.getLimitAccess().getNameIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLimitRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_0_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,53,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getLimitAccess().getEffortKeyword_1());
            		
            // InternalDsl.g:1855:3: ( (lv_effort_2_0= ruleSIGNED_NUMERIC ) )
            // InternalDsl.g:1856:4: (lv_effort_2_0= ruleSIGNED_NUMERIC )
            {
            // InternalDsl.g:1856:4: (lv_effort_2_0= ruleSIGNED_NUMERIC )
            // InternalDsl.g:1857:5: lv_effort_2_0= ruleSIGNED_NUMERIC
            {

            					newCompositeNode(grammarAccess.getLimitAccess().getEffortSIGNED_NUMERICParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_59);
            lv_effort_2_0=ruleSIGNED_NUMERIC();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLimitRule());
            					}
            					set(
            						current,
            						"effort",
            						lv_effort_2_0,
            						"org.xtext.urdf.Dsl.SIGNED_NUMERIC");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,54,FOLLOW_35); 

            			newLeafNode(otherlv_3, grammarAccess.getLimitAccess().getVelocityKeyword_3());
            		
            // InternalDsl.g:1878:3: ( (lv_velocity_4_0= ruleSIGNED_NUMERIC ) )
            // InternalDsl.g:1879:4: (lv_velocity_4_0= ruleSIGNED_NUMERIC )
            {
            // InternalDsl.g:1879:4: (lv_velocity_4_0= ruleSIGNED_NUMERIC )
            // InternalDsl.g:1880:5: lv_velocity_4_0= ruleSIGNED_NUMERIC
            {

            					newCompositeNode(grammarAccess.getLimitAccess().getVelocitySIGNED_NUMERICParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_60);
            lv_velocity_4_0=ruleSIGNED_NUMERIC();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLimitRule());
            					}
            					set(
            						current,
            						"velocity",
            						lv_velocity_4_0,
            						"org.xtext.urdf.Dsl.SIGNED_NUMERIC");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,55,FOLLOW_61); 

            			newLeafNode(otherlv_5, grammarAccess.getLimitAccess().getLowerKeyword_5());
            		
            // InternalDsl.g:1901:3: ( (lv_lower_6_0= ruleSIGNED_NUMERIC ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_INT||LA32_0==71) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalDsl.g:1902:4: (lv_lower_6_0= ruleSIGNED_NUMERIC )
                    {
                    // InternalDsl.g:1902:4: (lv_lower_6_0= ruleSIGNED_NUMERIC )
                    // InternalDsl.g:1903:5: lv_lower_6_0= ruleSIGNED_NUMERIC
                    {

                    					newCompositeNode(grammarAccess.getLimitAccess().getLowerSIGNED_NUMERICParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_62);
                    lv_lower_6_0=ruleSIGNED_NUMERIC();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLimitRule());
                    					}
                    					set(
                    						current,
                    						"lower",
                    						lv_lower_6_0,
                    						"org.xtext.urdf.Dsl.SIGNED_NUMERIC");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,56,FOLLOW_63); 

            			newLeafNode(otherlv_7, grammarAccess.getLimitAccess().getUpperKeyword_7());
            		
            // InternalDsl.g:1924:3: ( (lv_upper_8_0= ruleSIGNED_NUMERIC ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_INT||LA33_0==71) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalDsl.g:1925:4: (lv_upper_8_0= ruleSIGNED_NUMERIC )
                    {
                    // InternalDsl.g:1925:4: (lv_upper_8_0= ruleSIGNED_NUMERIC )
                    // InternalDsl.g:1926:5: lv_upper_8_0= ruleSIGNED_NUMERIC
                    {

                    					newCompositeNode(grammarAccess.getLimitAccess().getUpperSIGNED_NUMERICParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_upper_8_0=ruleSIGNED_NUMERIC();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLimitRule());
                    					}
                    					set(
                    						current,
                    						"upper",
                    						lv_upper_8_0,
                    						"org.xtext.urdf.Dsl.SIGNED_NUMERIC");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLimit"


    // $ANTLR start "entryRuleAxis"
    // InternalDsl.g:1947:1: entryRuleAxis returns [EObject current=null] : iv_ruleAxis= ruleAxis EOF ;
    public final EObject entryRuleAxis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAxis = null;


        try {
            // InternalDsl.g:1947:45: (iv_ruleAxis= ruleAxis EOF )
            // InternalDsl.g:1948:2: iv_ruleAxis= ruleAxis EOF
            {
             newCompositeNode(grammarAccess.getAxisRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAxis=ruleAxis();

            state._fsp--;

             current =iv_ruleAxis; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAxis"


    // $ANTLR start "ruleAxis"
    // InternalDsl.g:1954:1: ruleAxis returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) )? otherlv_1= 'xyz' ( (lv_x_2_0= RULE_AXIS_VALUE ) ) ( (lv_y_3_0= RULE_AXIS_VALUE ) ) ( (lv_z_4_0= RULE_AXIS_VALUE ) ) ) ;
    public final EObject ruleAxis() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_x_2_0=null;
        Token lv_y_3_0=null;
        Token lv_z_4_0=null;


        	enterRule();

        try {
            // InternalDsl.g:1960:2: ( ( ( (lv_name_0_0= RULE_ID ) )? otherlv_1= 'xyz' ( (lv_x_2_0= RULE_AXIS_VALUE ) ) ( (lv_y_3_0= RULE_AXIS_VALUE ) ) ( (lv_z_4_0= RULE_AXIS_VALUE ) ) ) )
            // InternalDsl.g:1961:2: ( ( (lv_name_0_0= RULE_ID ) )? otherlv_1= 'xyz' ( (lv_x_2_0= RULE_AXIS_VALUE ) ) ( (lv_y_3_0= RULE_AXIS_VALUE ) ) ( (lv_z_4_0= RULE_AXIS_VALUE ) ) )
            {
            // InternalDsl.g:1961:2: ( ( (lv_name_0_0= RULE_ID ) )? otherlv_1= 'xyz' ( (lv_x_2_0= RULE_AXIS_VALUE ) ) ( (lv_y_3_0= RULE_AXIS_VALUE ) ) ( (lv_z_4_0= RULE_AXIS_VALUE ) ) )
            // InternalDsl.g:1962:3: ( (lv_name_0_0= RULE_ID ) )? otherlv_1= 'xyz' ( (lv_x_2_0= RULE_AXIS_VALUE ) ) ( (lv_y_3_0= RULE_AXIS_VALUE ) ) ( (lv_z_4_0= RULE_AXIS_VALUE ) )
            {
            // InternalDsl.g:1962:3: ( (lv_name_0_0= RULE_ID ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalDsl.g:1963:4: (lv_name_0_0= RULE_ID )
                    {
                    // InternalDsl.g:1963:4: (lv_name_0_0= RULE_ID )
                    // InternalDsl.g:1964:5: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_34); 

                    					newLeafNode(lv_name_0_0, grammarAccess.getAxisAccess().getNameIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAxisRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_0_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,30,FOLLOW_64); 

            			newLeafNode(otherlv_1, grammarAccess.getAxisAccess().getXyzKeyword_1());
            		
            // InternalDsl.g:1984:3: ( (lv_x_2_0= RULE_AXIS_VALUE ) )
            // InternalDsl.g:1985:4: (lv_x_2_0= RULE_AXIS_VALUE )
            {
            // InternalDsl.g:1985:4: (lv_x_2_0= RULE_AXIS_VALUE )
            // InternalDsl.g:1986:5: lv_x_2_0= RULE_AXIS_VALUE
            {
            lv_x_2_0=(Token)match(input,RULE_AXIS_VALUE,FOLLOW_64); 

            					newLeafNode(lv_x_2_0, grammarAccess.getAxisAccess().getXAXIS_VALUETerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAxisRule());
            					}
            					setWithLastConsumed(
            						current,
            						"x",
            						lv_x_2_0,
            						"org.xtext.urdf.Dsl.AXIS_VALUE");
            				

            }


            }

            // InternalDsl.g:2002:3: ( (lv_y_3_0= RULE_AXIS_VALUE ) )
            // InternalDsl.g:2003:4: (lv_y_3_0= RULE_AXIS_VALUE )
            {
            // InternalDsl.g:2003:4: (lv_y_3_0= RULE_AXIS_VALUE )
            // InternalDsl.g:2004:5: lv_y_3_0= RULE_AXIS_VALUE
            {
            lv_y_3_0=(Token)match(input,RULE_AXIS_VALUE,FOLLOW_64); 

            					newLeafNode(lv_y_3_0, grammarAccess.getAxisAccess().getYAXIS_VALUETerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAxisRule());
            					}
            					setWithLastConsumed(
            						current,
            						"y",
            						lv_y_3_0,
            						"org.xtext.urdf.Dsl.AXIS_VALUE");
            				

            }


            }

            // InternalDsl.g:2020:3: ( (lv_z_4_0= RULE_AXIS_VALUE ) )
            // InternalDsl.g:2021:4: (lv_z_4_0= RULE_AXIS_VALUE )
            {
            // InternalDsl.g:2021:4: (lv_z_4_0= RULE_AXIS_VALUE )
            // InternalDsl.g:2022:5: lv_z_4_0= RULE_AXIS_VALUE
            {
            lv_z_4_0=(Token)match(input,RULE_AXIS_VALUE,FOLLOW_2); 

            					newLeafNode(lv_z_4_0, grammarAccess.getAxisAccess().getZAXIS_VALUETerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAxisRule());
            					}
            					setWithLastConsumed(
            						current,
            						"z",
            						lv_z_4_0,
            						"org.xtext.urdf.Dsl.AXIS_VALUE");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAxis"


    // $ANTLR start "entryRuleCalibration"
    // InternalDsl.g:2042:1: entryRuleCalibration returns [EObject current=null] : iv_ruleCalibration= ruleCalibration EOF ;
    public final EObject entryRuleCalibration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalibration = null;


        try {
            // InternalDsl.g:2042:52: (iv_ruleCalibration= ruleCalibration EOF )
            // InternalDsl.g:2043:2: iv_ruleCalibration= ruleCalibration EOF
            {
             newCompositeNode(grammarAccess.getCalibrationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCalibration=ruleCalibration();

            state._fsp--;

             current =iv_ruleCalibration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCalibration"


    // $ANTLR start "ruleCalibration"
    // InternalDsl.g:2049:1: ruleCalibration returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) )? (otherlv_2= 'rising' ( (lv_rising_3_0= ruleSIGNED_NUMERIC ) ) )? (otherlv_4= 'falling' ( (lv_falling_5_0= ruleSIGNED_NUMERIC ) ) )? ) ;
    public final EObject ruleCalibration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_rising_3_0 = null;

        AntlrDatatypeRuleToken lv_falling_5_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2055:2: ( ( () ( (lv_name_1_0= RULE_ID ) )? (otherlv_2= 'rising' ( (lv_rising_3_0= ruleSIGNED_NUMERIC ) ) )? (otherlv_4= 'falling' ( (lv_falling_5_0= ruleSIGNED_NUMERIC ) ) )? ) )
            // InternalDsl.g:2056:2: ( () ( (lv_name_1_0= RULE_ID ) )? (otherlv_2= 'rising' ( (lv_rising_3_0= ruleSIGNED_NUMERIC ) ) )? (otherlv_4= 'falling' ( (lv_falling_5_0= ruleSIGNED_NUMERIC ) ) )? )
            {
            // InternalDsl.g:2056:2: ( () ( (lv_name_1_0= RULE_ID ) )? (otherlv_2= 'rising' ( (lv_rising_3_0= ruleSIGNED_NUMERIC ) ) )? (otherlv_4= 'falling' ( (lv_falling_5_0= ruleSIGNED_NUMERIC ) ) )? )
            // InternalDsl.g:2057:3: () ( (lv_name_1_0= RULE_ID ) )? (otherlv_2= 'rising' ( (lv_rising_3_0= ruleSIGNED_NUMERIC ) ) )? (otherlv_4= 'falling' ( (lv_falling_5_0= ruleSIGNED_NUMERIC ) ) )?
            {
            // InternalDsl.g:2057:3: ()
            // InternalDsl.g:2058:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCalibrationAccess().getCalibrationAction_0(),
            					current);
            			

            }

            // InternalDsl.g:2064:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalDsl.g:2065:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalDsl.g:2065:4: (lv_name_1_0= RULE_ID )
                    // InternalDsl.g:2066:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_65); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getCalibrationAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCalibrationRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalDsl.g:2082:3: (otherlv_2= 'rising' ( (lv_rising_3_0= ruleSIGNED_NUMERIC ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==57) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalDsl.g:2083:4: otherlv_2= 'rising' ( (lv_rising_3_0= ruleSIGNED_NUMERIC ) )
                    {
                    otherlv_2=(Token)match(input,57,FOLLOW_35); 

                    				newLeafNode(otherlv_2, grammarAccess.getCalibrationAccess().getRisingKeyword_2_0());
                    			
                    // InternalDsl.g:2087:4: ( (lv_rising_3_0= ruleSIGNED_NUMERIC ) )
                    // InternalDsl.g:2088:5: (lv_rising_3_0= ruleSIGNED_NUMERIC )
                    {
                    // InternalDsl.g:2088:5: (lv_rising_3_0= ruleSIGNED_NUMERIC )
                    // InternalDsl.g:2089:6: lv_rising_3_0= ruleSIGNED_NUMERIC
                    {

                    						newCompositeNode(grammarAccess.getCalibrationAccess().getRisingSIGNED_NUMERICParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_66);
                    lv_rising_3_0=ruleSIGNED_NUMERIC();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCalibrationRule());
                    						}
                    						set(
                    							current,
                    							"rising",
                    							lv_rising_3_0,
                    							"org.xtext.urdf.Dsl.SIGNED_NUMERIC");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:2107:3: (otherlv_4= 'falling' ( (lv_falling_5_0= ruleSIGNED_NUMERIC ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==58) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalDsl.g:2108:4: otherlv_4= 'falling' ( (lv_falling_5_0= ruleSIGNED_NUMERIC ) )
                    {
                    otherlv_4=(Token)match(input,58,FOLLOW_35); 

                    				newLeafNode(otherlv_4, grammarAccess.getCalibrationAccess().getFallingKeyword_3_0());
                    			
                    // InternalDsl.g:2112:4: ( (lv_falling_5_0= ruleSIGNED_NUMERIC ) )
                    // InternalDsl.g:2113:5: (lv_falling_5_0= ruleSIGNED_NUMERIC )
                    {
                    // InternalDsl.g:2113:5: (lv_falling_5_0= ruleSIGNED_NUMERIC )
                    // InternalDsl.g:2114:6: lv_falling_5_0= ruleSIGNED_NUMERIC
                    {

                    						newCompositeNode(grammarAccess.getCalibrationAccess().getFallingSIGNED_NUMERICParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_falling_5_0=ruleSIGNED_NUMERIC();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCalibrationRule());
                    						}
                    						set(
                    							current,
                    							"falling",
                    							lv_falling_5_0,
                    							"org.xtext.urdf.Dsl.SIGNED_NUMERIC");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCalibration"


    // $ANTLR start "entryRuleDynamics"
    // InternalDsl.g:2136:1: entryRuleDynamics returns [EObject current=null] : iv_ruleDynamics= ruleDynamics EOF ;
    public final EObject entryRuleDynamics() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDynamics = null;


        try {
            // InternalDsl.g:2136:49: (iv_ruleDynamics= ruleDynamics EOF )
            // InternalDsl.g:2137:2: iv_ruleDynamics= ruleDynamics EOF
            {
             newCompositeNode(grammarAccess.getDynamicsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDynamics=ruleDynamics();

            state._fsp--;

             current =iv_ruleDynamics; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDynamics"


    // $ANTLR start "ruleDynamics"
    // InternalDsl.g:2143:1: ruleDynamics returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) )? (otherlv_2= 'friction' ( (lv_friction_3_0= ruleSIGNED_NUMERIC ) ) )? (otherlv_4= 'damping' ( (lv_damping_5_0= ruleSIGNED_NUMERIC ) ) )? ) ;
    public final EObject ruleDynamics() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_friction_3_0 = null;

        AntlrDatatypeRuleToken lv_damping_5_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2149:2: ( ( () ( (lv_name_1_0= RULE_ID ) )? (otherlv_2= 'friction' ( (lv_friction_3_0= ruleSIGNED_NUMERIC ) ) )? (otherlv_4= 'damping' ( (lv_damping_5_0= ruleSIGNED_NUMERIC ) ) )? ) )
            // InternalDsl.g:2150:2: ( () ( (lv_name_1_0= RULE_ID ) )? (otherlv_2= 'friction' ( (lv_friction_3_0= ruleSIGNED_NUMERIC ) ) )? (otherlv_4= 'damping' ( (lv_damping_5_0= ruleSIGNED_NUMERIC ) ) )? )
            {
            // InternalDsl.g:2150:2: ( () ( (lv_name_1_0= RULE_ID ) )? (otherlv_2= 'friction' ( (lv_friction_3_0= ruleSIGNED_NUMERIC ) ) )? (otherlv_4= 'damping' ( (lv_damping_5_0= ruleSIGNED_NUMERIC ) ) )? )
            // InternalDsl.g:2151:3: () ( (lv_name_1_0= RULE_ID ) )? (otherlv_2= 'friction' ( (lv_friction_3_0= ruleSIGNED_NUMERIC ) ) )? (otherlv_4= 'damping' ( (lv_damping_5_0= ruleSIGNED_NUMERIC ) ) )?
            {
            // InternalDsl.g:2151:3: ()
            // InternalDsl.g:2152:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDynamicsAccess().getDynamicsAction_0(),
            					current);
            			

            }

            // InternalDsl.g:2158:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalDsl.g:2159:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalDsl.g:2159:4: (lv_name_1_0= RULE_ID )
                    // InternalDsl.g:2160:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_67); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getDynamicsAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDynamicsRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalDsl.g:2176:3: (otherlv_2= 'friction' ( (lv_friction_3_0= ruleSIGNED_NUMERIC ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==59) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalDsl.g:2177:4: otherlv_2= 'friction' ( (lv_friction_3_0= ruleSIGNED_NUMERIC ) )
                    {
                    otherlv_2=(Token)match(input,59,FOLLOW_35); 

                    				newLeafNode(otherlv_2, grammarAccess.getDynamicsAccess().getFrictionKeyword_2_0());
                    			
                    // InternalDsl.g:2181:4: ( (lv_friction_3_0= ruleSIGNED_NUMERIC ) )
                    // InternalDsl.g:2182:5: (lv_friction_3_0= ruleSIGNED_NUMERIC )
                    {
                    // InternalDsl.g:2182:5: (lv_friction_3_0= ruleSIGNED_NUMERIC )
                    // InternalDsl.g:2183:6: lv_friction_3_0= ruleSIGNED_NUMERIC
                    {

                    						newCompositeNode(grammarAccess.getDynamicsAccess().getFrictionSIGNED_NUMERICParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_68);
                    lv_friction_3_0=ruleSIGNED_NUMERIC();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDynamicsRule());
                    						}
                    						set(
                    							current,
                    							"friction",
                    							lv_friction_3_0,
                    							"org.xtext.urdf.Dsl.SIGNED_NUMERIC");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:2201:3: (otherlv_4= 'damping' ( (lv_damping_5_0= ruleSIGNED_NUMERIC ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==60) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalDsl.g:2202:4: otherlv_4= 'damping' ( (lv_damping_5_0= ruleSIGNED_NUMERIC ) )
                    {
                    otherlv_4=(Token)match(input,60,FOLLOW_35); 

                    				newLeafNode(otherlv_4, grammarAccess.getDynamicsAccess().getDampingKeyword_3_0());
                    			
                    // InternalDsl.g:2206:4: ( (lv_damping_5_0= ruleSIGNED_NUMERIC ) )
                    // InternalDsl.g:2207:5: (lv_damping_5_0= ruleSIGNED_NUMERIC )
                    {
                    // InternalDsl.g:2207:5: (lv_damping_5_0= ruleSIGNED_NUMERIC )
                    // InternalDsl.g:2208:6: lv_damping_5_0= ruleSIGNED_NUMERIC
                    {

                    						newCompositeNode(grammarAccess.getDynamicsAccess().getDampingSIGNED_NUMERICParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_damping_5_0=ruleSIGNED_NUMERIC();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDynamicsRule());
                    						}
                    						set(
                    							current,
                    							"damping",
                    							lv_damping_5_0,
                    							"org.xtext.urdf.Dsl.SIGNED_NUMERIC");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDynamics"


    // $ANTLR start "entryRuleMimic"
    // InternalDsl.g:2230:1: entryRuleMimic returns [EObject current=null] : iv_ruleMimic= ruleMimic EOF ;
    public final EObject entryRuleMimic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMimic = null;


        try {
            // InternalDsl.g:2230:46: (iv_ruleMimic= ruleMimic EOF )
            // InternalDsl.g:2231:2: iv_ruleMimic= ruleMimic EOF
            {
             newCompositeNode(grammarAccess.getMimicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMimic=ruleMimic();

            state._fsp--;

             current =iv_ruleMimic; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMimic"


    // $ANTLR start "ruleMimic"
    // InternalDsl.g:2237:1: ruleMimic returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) )? otherlv_1= 'mimics' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'multiplier' ( (lv_multiplier_4_0= ruleSIGNED_NUMERIC ) ) )? (otherlv_5= 'offSet' ( (lv_offSet_6_0= ruleSIGNED_NUMERIC ) ) )? ) ;
    public final EObject ruleMimic() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_multiplier_4_0 = null;

        AntlrDatatypeRuleToken lv_offSet_6_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2243:2: ( ( ( (lv_name_0_0= RULE_ID ) )? otherlv_1= 'mimics' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'multiplier' ( (lv_multiplier_4_0= ruleSIGNED_NUMERIC ) ) )? (otherlv_5= 'offSet' ( (lv_offSet_6_0= ruleSIGNED_NUMERIC ) ) )? ) )
            // InternalDsl.g:2244:2: ( ( (lv_name_0_0= RULE_ID ) )? otherlv_1= 'mimics' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'multiplier' ( (lv_multiplier_4_0= ruleSIGNED_NUMERIC ) ) )? (otherlv_5= 'offSet' ( (lv_offSet_6_0= ruleSIGNED_NUMERIC ) ) )? )
            {
            // InternalDsl.g:2244:2: ( ( (lv_name_0_0= RULE_ID ) )? otherlv_1= 'mimics' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'multiplier' ( (lv_multiplier_4_0= ruleSIGNED_NUMERIC ) ) )? (otherlv_5= 'offSet' ( (lv_offSet_6_0= ruleSIGNED_NUMERIC ) ) )? )
            // InternalDsl.g:2245:3: ( (lv_name_0_0= RULE_ID ) )? otherlv_1= 'mimics' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'multiplier' ( (lv_multiplier_4_0= ruleSIGNED_NUMERIC ) ) )? (otherlv_5= 'offSet' ( (lv_offSet_6_0= ruleSIGNED_NUMERIC ) ) )?
            {
            // InternalDsl.g:2245:3: ( (lv_name_0_0= RULE_ID ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalDsl.g:2246:4: (lv_name_0_0= RULE_ID )
                    {
                    // InternalDsl.g:2246:4: (lv_name_0_0= RULE_ID )
                    // InternalDsl.g:2247:5: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_69); 

                    					newLeafNode(lv_name_0_0, grammarAccess.getMimicAccess().getNameIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMimicRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_0_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,61,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMimicAccess().getMimicsKeyword_1());
            		
            // InternalDsl.g:2267:3: ( (otherlv_2= RULE_ID ) )
            // InternalDsl.g:2268:4: (otherlv_2= RULE_ID )
            {
            // InternalDsl.g:2268:4: (otherlv_2= RULE_ID )
            // InternalDsl.g:2269:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMimicRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_70); 

            					newLeafNode(otherlv_2, grammarAccess.getMimicAccess().getMimicsJointCrossReference_2_0());
            				

            }


            }

            // InternalDsl.g:2280:3: (otherlv_3= 'multiplier' ( (lv_multiplier_4_0= ruleSIGNED_NUMERIC ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==62) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalDsl.g:2281:4: otherlv_3= 'multiplier' ( (lv_multiplier_4_0= ruleSIGNED_NUMERIC ) )
                    {
                    otherlv_3=(Token)match(input,62,FOLLOW_35); 

                    				newLeafNode(otherlv_3, grammarAccess.getMimicAccess().getMultiplierKeyword_3_0());
                    			
                    // InternalDsl.g:2285:4: ( (lv_multiplier_4_0= ruleSIGNED_NUMERIC ) )
                    // InternalDsl.g:2286:5: (lv_multiplier_4_0= ruleSIGNED_NUMERIC )
                    {
                    // InternalDsl.g:2286:5: (lv_multiplier_4_0= ruleSIGNED_NUMERIC )
                    // InternalDsl.g:2287:6: lv_multiplier_4_0= ruleSIGNED_NUMERIC
                    {

                    						newCompositeNode(grammarAccess.getMimicAccess().getMultiplierSIGNED_NUMERICParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_71);
                    lv_multiplier_4_0=ruleSIGNED_NUMERIC();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMimicRule());
                    						}
                    						set(
                    							current,
                    							"multiplier",
                    							lv_multiplier_4_0,
                    							"org.xtext.urdf.Dsl.SIGNED_NUMERIC");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:2305:3: (otherlv_5= 'offSet' ( (lv_offSet_6_0= ruleSIGNED_NUMERIC ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==63) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalDsl.g:2306:4: otherlv_5= 'offSet' ( (lv_offSet_6_0= ruleSIGNED_NUMERIC ) )
                    {
                    otherlv_5=(Token)match(input,63,FOLLOW_35); 

                    				newLeafNode(otherlv_5, grammarAccess.getMimicAccess().getOffSetKeyword_4_0());
                    			
                    // InternalDsl.g:2310:4: ( (lv_offSet_6_0= ruleSIGNED_NUMERIC ) )
                    // InternalDsl.g:2311:5: (lv_offSet_6_0= ruleSIGNED_NUMERIC )
                    {
                    // InternalDsl.g:2311:5: (lv_offSet_6_0= ruleSIGNED_NUMERIC )
                    // InternalDsl.g:2312:6: lv_offSet_6_0= ruleSIGNED_NUMERIC
                    {

                    						newCompositeNode(grammarAccess.getMimicAccess().getOffSetSIGNED_NUMERICParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_offSet_6_0=ruleSIGNED_NUMERIC();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMimicRule());
                    						}
                    						set(
                    							current,
                    							"offSet",
                    							lv_offSet_6_0,
                    							"org.xtext.urdf.Dsl.SIGNED_NUMERIC");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMimic"


    // $ANTLR start "entryRuleSafetyController"
    // InternalDsl.g:2334:1: entryRuleSafetyController returns [EObject current=null] : iv_ruleSafetyController= ruleSafetyController EOF ;
    public final EObject entryRuleSafetyController() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSafetyController = null;


        try {
            // InternalDsl.g:2334:57: (iv_ruleSafetyController= ruleSafetyController EOF )
            // InternalDsl.g:2335:2: iv_ruleSafetyController= ruleSafetyController EOF
            {
             newCompositeNode(grammarAccess.getSafetyControllerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSafetyController=ruleSafetyController();

            state._fsp--;

             current =iv_ruleSafetyController; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSafetyController"


    // $ANTLR start "ruleSafetyController"
    // InternalDsl.g:2341:1: ruleSafetyController returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) )? (otherlv_1= 'softLowerLimit' ( (lv_softLowerLimit_2_0= ruleSIGNED_NUMERIC ) ) )? (otherlv_3= 'softUpperLimit' ( (lv_softUpperLimit_4_0= ruleSIGNED_NUMERIC ) ) )? (otherlv_5= 'k_position' ( (lv_k_position_6_0= ruleSIGNED_NUMERIC ) ) )? otherlv_7= 'k_velocity' ( (lv_k_velocity_8_0= ruleSIGNED_NUMERIC ) ) ) ;
    public final EObject ruleSafetyController() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_softLowerLimit_2_0 = null;

        AntlrDatatypeRuleToken lv_softUpperLimit_4_0 = null;

        AntlrDatatypeRuleToken lv_k_position_6_0 = null;

        AntlrDatatypeRuleToken lv_k_velocity_8_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2347:2: ( ( ( (lv_name_0_0= RULE_ID ) )? (otherlv_1= 'softLowerLimit' ( (lv_softLowerLimit_2_0= ruleSIGNED_NUMERIC ) ) )? (otherlv_3= 'softUpperLimit' ( (lv_softUpperLimit_4_0= ruleSIGNED_NUMERIC ) ) )? (otherlv_5= 'k_position' ( (lv_k_position_6_0= ruleSIGNED_NUMERIC ) ) )? otherlv_7= 'k_velocity' ( (lv_k_velocity_8_0= ruleSIGNED_NUMERIC ) ) ) )
            // InternalDsl.g:2348:2: ( ( (lv_name_0_0= RULE_ID ) )? (otherlv_1= 'softLowerLimit' ( (lv_softLowerLimit_2_0= ruleSIGNED_NUMERIC ) ) )? (otherlv_3= 'softUpperLimit' ( (lv_softUpperLimit_4_0= ruleSIGNED_NUMERIC ) ) )? (otherlv_5= 'k_position' ( (lv_k_position_6_0= ruleSIGNED_NUMERIC ) ) )? otherlv_7= 'k_velocity' ( (lv_k_velocity_8_0= ruleSIGNED_NUMERIC ) ) )
            {
            // InternalDsl.g:2348:2: ( ( (lv_name_0_0= RULE_ID ) )? (otherlv_1= 'softLowerLimit' ( (lv_softLowerLimit_2_0= ruleSIGNED_NUMERIC ) ) )? (otherlv_3= 'softUpperLimit' ( (lv_softUpperLimit_4_0= ruleSIGNED_NUMERIC ) ) )? (otherlv_5= 'k_position' ( (lv_k_position_6_0= ruleSIGNED_NUMERIC ) ) )? otherlv_7= 'k_velocity' ( (lv_k_velocity_8_0= ruleSIGNED_NUMERIC ) ) )
            // InternalDsl.g:2349:3: ( (lv_name_0_0= RULE_ID ) )? (otherlv_1= 'softLowerLimit' ( (lv_softLowerLimit_2_0= ruleSIGNED_NUMERIC ) ) )? (otherlv_3= 'softUpperLimit' ( (lv_softUpperLimit_4_0= ruleSIGNED_NUMERIC ) ) )? (otherlv_5= 'k_position' ( (lv_k_position_6_0= ruleSIGNED_NUMERIC ) ) )? otherlv_7= 'k_velocity' ( (lv_k_velocity_8_0= ruleSIGNED_NUMERIC ) )
            {
            // InternalDsl.g:2349:3: ( (lv_name_0_0= RULE_ID ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalDsl.g:2350:4: (lv_name_0_0= RULE_ID )
                    {
                    // InternalDsl.g:2350:4: (lv_name_0_0= RULE_ID )
                    // InternalDsl.g:2351:5: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_72); 

                    					newLeafNode(lv_name_0_0, grammarAccess.getSafetyControllerAccess().getNameIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSafetyControllerRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_0_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalDsl.g:2367:3: (otherlv_1= 'softLowerLimit' ( (lv_softLowerLimit_2_0= ruleSIGNED_NUMERIC ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==64) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalDsl.g:2368:4: otherlv_1= 'softLowerLimit' ( (lv_softLowerLimit_2_0= ruleSIGNED_NUMERIC ) )
                    {
                    otherlv_1=(Token)match(input,64,FOLLOW_35); 

                    				newLeafNode(otherlv_1, grammarAccess.getSafetyControllerAccess().getSoftLowerLimitKeyword_1_0());
                    			
                    // InternalDsl.g:2372:4: ( (lv_softLowerLimit_2_0= ruleSIGNED_NUMERIC ) )
                    // InternalDsl.g:2373:5: (lv_softLowerLimit_2_0= ruleSIGNED_NUMERIC )
                    {
                    // InternalDsl.g:2373:5: (lv_softLowerLimit_2_0= ruleSIGNED_NUMERIC )
                    // InternalDsl.g:2374:6: lv_softLowerLimit_2_0= ruleSIGNED_NUMERIC
                    {

                    						newCompositeNode(grammarAccess.getSafetyControllerAccess().getSoftLowerLimitSIGNED_NUMERICParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_73);
                    lv_softLowerLimit_2_0=ruleSIGNED_NUMERIC();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSafetyControllerRule());
                    						}
                    						set(
                    							current,
                    							"softLowerLimit",
                    							lv_softLowerLimit_2_0,
                    							"org.xtext.urdf.Dsl.SIGNED_NUMERIC");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:2392:3: (otherlv_3= 'softUpperLimit' ( (lv_softUpperLimit_4_0= ruleSIGNED_NUMERIC ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==65) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalDsl.g:2393:4: otherlv_3= 'softUpperLimit' ( (lv_softUpperLimit_4_0= ruleSIGNED_NUMERIC ) )
                    {
                    otherlv_3=(Token)match(input,65,FOLLOW_35); 

                    				newLeafNode(otherlv_3, grammarAccess.getSafetyControllerAccess().getSoftUpperLimitKeyword_2_0());
                    			
                    // InternalDsl.g:2397:4: ( (lv_softUpperLimit_4_0= ruleSIGNED_NUMERIC ) )
                    // InternalDsl.g:2398:5: (lv_softUpperLimit_4_0= ruleSIGNED_NUMERIC )
                    {
                    // InternalDsl.g:2398:5: (lv_softUpperLimit_4_0= ruleSIGNED_NUMERIC )
                    // InternalDsl.g:2399:6: lv_softUpperLimit_4_0= ruleSIGNED_NUMERIC
                    {

                    						newCompositeNode(grammarAccess.getSafetyControllerAccess().getSoftUpperLimitSIGNED_NUMERICParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_74);
                    lv_softUpperLimit_4_0=ruleSIGNED_NUMERIC();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSafetyControllerRule());
                    						}
                    						set(
                    							current,
                    							"softUpperLimit",
                    							lv_softUpperLimit_4_0,
                    							"org.xtext.urdf.Dsl.SIGNED_NUMERIC");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:2417:3: (otherlv_5= 'k_position' ( (lv_k_position_6_0= ruleSIGNED_NUMERIC ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==66) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalDsl.g:2418:4: otherlv_5= 'k_position' ( (lv_k_position_6_0= ruleSIGNED_NUMERIC ) )
                    {
                    otherlv_5=(Token)match(input,66,FOLLOW_35); 

                    				newLeafNode(otherlv_5, grammarAccess.getSafetyControllerAccess().getK_positionKeyword_3_0());
                    			
                    // InternalDsl.g:2422:4: ( (lv_k_position_6_0= ruleSIGNED_NUMERIC ) )
                    // InternalDsl.g:2423:5: (lv_k_position_6_0= ruleSIGNED_NUMERIC )
                    {
                    // InternalDsl.g:2423:5: (lv_k_position_6_0= ruleSIGNED_NUMERIC )
                    // InternalDsl.g:2424:6: lv_k_position_6_0= ruleSIGNED_NUMERIC
                    {

                    						newCompositeNode(grammarAccess.getSafetyControllerAccess().getK_positionSIGNED_NUMERICParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_75);
                    lv_k_position_6_0=ruleSIGNED_NUMERIC();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSafetyControllerRule());
                    						}
                    						set(
                    							current,
                    							"k_position",
                    							lv_k_position_6_0,
                    							"org.xtext.urdf.Dsl.SIGNED_NUMERIC");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,67,FOLLOW_35); 

            			newLeafNode(otherlv_7, grammarAccess.getSafetyControllerAccess().getK_velocityKeyword_4());
            		
            // InternalDsl.g:2446:3: ( (lv_k_velocity_8_0= ruleSIGNED_NUMERIC ) )
            // InternalDsl.g:2447:4: (lv_k_velocity_8_0= ruleSIGNED_NUMERIC )
            {
            // InternalDsl.g:2447:4: (lv_k_velocity_8_0= ruleSIGNED_NUMERIC )
            // InternalDsl.g:2448:5: lv_k_velocity_8_0= ruleSIGNED_NUMERIC
            {

            					newCompositeNode(grammarAccess.getSafetyControllerAccess().getK_velocitySIGNED_NUMERICParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_k_velocity_8_0=ruleSIGNED_NUMERIC();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSafetyControllerRule());
            					}
            					set(
            						current,
            						"k_velocity",
            						lv_k_velocity_8_0,
            						"org.xtext.urdf.Dsl.SIGNED_NUMERIC");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSafetyController"


    // $ANTLR start "entryRuleFLOAT"
    // InternalDsl.g:2469:1: entryRuleFLOAT returns [String current=null] : iv_ruleFLOAT= ruleFLOAT EOF ;
    public final String entryRuleFLOAT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFLOAT = null;


        try {
            // InternalDsl.g:2469:45: (iv_ruleFLOAT= ruleFLOAT EOF )
            // InternalDsl.g:2470:2: iv_ruleFLOAT= ruleFLOAT EOF
            {
             newCompositeNode(grammarAccess.getFLOATRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFLOAT=ruleFLOAT();

            state._fsp--;

             current =iv_ruleFLOAT.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFLOAT"


    // $ANTLR start "ruleFLOAT"
    // InternalDsl.g:2476:1: ruleFLOAT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleFLOAT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalDsl.g:2482:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalDsl.g:2483:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalDsl.g:2483:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalDsl.g:2484:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_76); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getFLOATAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,68,FOLLOW_39); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getFLOATAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getFLOATAccess().getINTTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFLOAT"


    // $ANTLR start "entryRuleSCIENTIFIC"
    // InternalDsl.g:2507:1: entryRuleSCIENTIFIC returns [String current=null] : iv_ruleSCIENTIFIC= ruleSCIENTIFIC EOF ;
    public final String entryRuleSCIENTIFIC() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSCIENTIFIC = null;


        try {
            // InternalDsl.g:2507:50: (iv_ruleSCIENTIFIC= ruleSCIENTIFIC EOF )
            // InternalDsl.g:2508:2: iv_ruleSCIENTIFIC= ruleSCIENTIFIC EOF
            {
             newCompositeNode(grammarAccess.getSCIENTIFICRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSCIENTIFIC=ruleSCIENTIFIC();

            state._fsp--;

             current =iv_ruleSCIENTIFIC.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSCIENTIFIC"


    // $ANTLR start "ruleSCIENTIFIC"
    // InternalDsl.g:2514:1: ruleSCIENTIFIC returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FLOAT_0= ruleFLOAT kw= 'e' (kw= '+' | kw= '-' )? this_INT_4= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleSCIENTIFIC() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_4=null;
        AntlrDatatypeRuleToken this_FLOAT_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2520:2: ( (this_FLOAT_0= ruleFLOAT kw= 'e' (kw= '+' | kw= '-' )? this_INT_4= RULE_INT ) )
            // InternalDsl.g:2521:2: (this_FLOAT_0= ruleFLOAT kw= 'e' (kw= '+' | kw= '-' )? this_INT_4= RULE_INT )
            {
            // InternalDsl.g:2521:2: (this_FLOAT_0= ruleFLOAT kw= 'e' (kw= '+' | kw= '-' )? this_INT_4= RULE_INT )
            // InternalDsl.g:2522:3: this_FLOAT_0= ruleFLOAT kw= 'e' (kw= '+' | kw= '-' )? this_INT_4= RULE_INT
            {

            			newCompositeNode(grammarAccess.getSCIENTIFICAccess().getFLOATParserRuleCall_0());
            		
            pushFollow(FOLLOW_77);
            this_FLOAT_0=ruleFLOAT();

            state._fsp--;


            			current.merge(this_FLOAT_0);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,69,FOLLOW_78); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getSCIENTIFICAccess().getEKeyword_1());
            		
            // InternalDsl.g:2537:3: (kw= '+' | kw= '-' )?
            int alt48=3;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==70) ) {
                alt48=1;
            }
            else if ( (LA48_0==71) ) {
                alt48=2;
            }
            switch (alt48) {
                case 1 :
                    // InternalDsl.g:2538:4: kw= '+'
                    {
                    kw=(Token)match(input,70,FOLLOW_39); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getSCIENTIFICAccess().getPlusSignKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDsl.g:2544:4: kw= '-'
                    {
                    kw=(Token)match(input,71,FOLLOW_39); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getSCIENTIFICAccess().getHyphenMinusKeyword_2_1());
                    			

                    }
                    break;

            }

            this_INT_4=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_4);
            		

            			newLeafNode(this_INT_4, grammarAccess.getSCIENTIFICAccess().getINTTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSCIENTIFIC"


    // $ANTLR start "entryRuleSIGNED_NUMERIC"
    // InternalDsl.g:2561:1: entryRuleSIGNED_NUMERIC returns [String current=null] : iv_ruleSIGNED_NUMERIC= ruleSIGNED_NUMERIC EOF ;
    public final String entryRuleSIGNED_NUMERIC() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSIGNED_NUMERIC = null;


        try {
            // InternalDsl.g:2561:54: (iv_ruleSIGNED_NUMERIC= ruleSIGNED_NUMERIC EOF )
            // InternalDsl.g:2562:2: iv_ruleSIGNED_NUMERIC= ruleSIGNED_NUMERIC EOF
            {
             newCompositeNode(grammarAccess.getSIGNED_NUMERICRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSIGNED_NUMERIC=ruleSIGNED_NUMERIC();

            state._fsp--;

             current =iv_ruleSIGNED_NUMERIC.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSIGNED_NUMERIC"


    // $ANTLR start "ruleSIGNED_NUMERIC"
    // InternalDsl.g:2568:1: ruleSIGNED_NUMERIC returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT | this_FLOAT_2= ruleFLOAT | this_SCIENTIFIC_3= ruleSCIENTIFIC ) ) ;
    public final AntlrDatatypeRuleToken ruleSIGNED_NUMERIC() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        AntlrDatatypeRuleToken this_FLOAT_2 = null;

        AntlrDatatypeRuleToken this_SCIENTIFIC_3 = null;



        	enterRule();

        try {
            // InternalDsl.g:2574:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT | this_FLOAT_2= ruleFLOAT | this_SCIENTIFIC_3= ruleSCIENTIFIC ) ) )
            // InternalDsl.g:2575:2: ( (kw= '-' )? (this_INT_1= RULE_INT | this_FLOAT_2= ruleFLOAT | this_SCIENTIFIC_3= ruleSCIENTIFIC ) )
            {
            // InternalDsl.g:2575:2: ( (kw= '-' )? (this_INT_1= RULE_INT | this_FLOAT_2= ruleFLOAT | this_SCIENTIFIC_3= ruleSCIENTIFIC ) )
            // InternalDsl.g:2576:3: (kw= '-' )? (this_INT_1= RULE_INT | this_FLOAT_2= ruleFLOAT | this_SCIENTIFIC_3= ruleSCIENTIFIC )
            {
            // InternalDsl.g:2576:3: (kw= '-' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==71) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalDsl.g:2577:4: kw= '-'
                    {
                    kw=(Token)match(input,71,FOLLOW_35); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getSIGNED_NUMERICAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalDsl.g:2583:3: (this_INT_1= RULE_INT | this_FLOAT_2= ruleFLOAT | this_SCIENTIFIC_3= ruleSCIENTIFIC )
            int alt50=3;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_INT) ) {
                int LA50_1 = input.LA(2);

                if ( (LA50_1==EOF||LA50_1==RULE_INT||(LA50_1>=13 && LA50_1<=14)||(LA50_1>=19 && LA50_1<=25)||(LA50_1>=27 && LA50_1<=29)||(LA50_1>=31 && LA50_1<=32)||(LA50_1>=36 && LA50_1<=40)||(LA50_1>=54 && LA50_1<=56)||LA50_1==58||LA50_1==60||LA50_1==63||(LA50_1>=65 && LA50_1<=67)||LA50_1==71) ) {
                    alt50=1;
                }
                else if ( (LA50_1==68) ) {
                    int LA50_3 = input.LA(3);

                    if ( (LA50_3==RULE_INT) ) {
                        int LA50_4 = input.LA(4);

                        if ( (LA50_4==69) ) {
                            alt50=3;
                        }
                        else if ( (LA50_4==EOF||LA50_4==RULE_INT||(LA50_4>=13 && LA50_4<=14)||(LA50_4>=19 && LA50_4<=25)||(LA50_4>=27 && LA50_4<=29)||(LA50_4>=31 && LA50_4<=32)||(LA50_4>=36 && LA50_4<=40)||(LA50_4>=54 && LA50_4<=56)||LA50_4==58||LA50_4==60||LA50_4==63||(LA50_4>=65 && LA50_4<=67)||LA50_4==71) ) {
                            alt50=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 50, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 50, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalDsl.g:2584:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getSIGNED_NUMERICAccess().getINTTerminalRuleCall_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDsl.g:2592:4: this_FLOAT_2= ruleFLOAT
                    {

                    				newCompositeNode(grammarAccess.getSIGNED_NUMERICAccess().getFLOATParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_FLOAT_2=ruleFLOAT();

                    state._fsp--;


                    				current.merge(this_FLOAT_2);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalDsl.g:2603:4: this_SCIENTIFIC_3= ruleSCIENTIFIC
                    {

                    				newCompositeNode(grammarAccess.getSIGNED_NUMERICAccess().getSCIENTIFICParserRuleCall_1_2());
                    			
                    pushFollow(FOLLOW_2);
                    this_SCIENTIFIC_3=ruleSCIENTIFIC();

                    state._fsp--;


                    				current.merge(this_SCIENTIFIC_3);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSIGNED_NUMERIC"


    // $ANTLR start "entryRuleMEASURE"
    // InternalDsl.g:2618:1: entryRuleMEASURE returns [String current=null] : iv_ruleMEASURE= ruleMEASURE EOF ;
    public final String entryRuleMEASURE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMEASURE = null;


        try {
            // InternalDsl.g:2618:47: (iv_ruleMEASURE= ruleMEASURE EOF )
            // InternalDsl.g:2619:2: iv_ruleMEASURE= ruleMEASURE EOF
            {
             newCompositeNode(grammarAccess.getMEASURERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMEASURE=ruleMEASURE();

            state._fsp--;

             current =iv_ruleMEASURE.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMEASURE"


    // $ANTLR start "ruleMEASURE"
    // InternalDsl.g:2625:1: ruleMEASURE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_FLOAT_1= ruleFLOAT ) ;
    public final AntlrDatatypeRuleToken ruleMEASURE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        AntlrDatatypeRuleToken this_FLOAT_1 = null;



        	enterRule();

        try {
            // InternalDsl.g:2631:2: ( (this_INT_0= RULE_INT | this_FLOAT_1= ruleFLOAT ) )
            // InternalDsl.g:2632:2: (this_INT_0= RULE_INT | this_FLOAT_1= ruleFLOAT )
            {
            // InternalDsl.g:2632:2: (this_INT_0= RULE_INT | this_FLOAT_1= ruleFLOAT )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_INT) ) {
                int LA51_1 = input.LA(2);

                if ( (LA51_1==68) ) {
                    alt51=2;
                }
                else if ( (LA51_1==EOF||LA51_1==RULE_INT||(LA51_1>=13 && LA51_1<=14)||(LA51_1>=24 && LA51_1<=25)||(LA51_1>=27 && LA51_1<=29)||LA51_1==49) ) {
                    alt51=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalDsl.g:2633:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getMEASUREAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:2641:3: this_FLOAT_1= ruleFLOAT
                    {

                    			newCompositeNode(grammarAccess.getMEASUREAccess().getFLOATParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FLOAT_1=ruleFLOAT();

                    state._fsp--;


                    			current.merge(this_FLOAT_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMEASURE"


    // $ANTLR start "ruleJointType"
    // InternalDsl.g:2655:1: ruleJointType returns [Enumerator current=null] : ( (enumLiteral_0= 'Fixed' ) | (enumLiteral_1= 'Revolute' ) | (enumLiteral_2= 'Prismatic' ) | (enumLiteral_3= 'Continuous' ) ) ;
    public final Enumerator ruleJointType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDsl.g:2661:2: ( ( (enumLiteral_0= 'Fixed' ) | (enumLiteral_1= 'Revolute' ) | (enumLiteral_2= 'Prismatic' ) | (enumLiteral_3= 'Continuous' ) ) )
            // InternalDsl.g:2662:2: ( (enumLiteral_0= 'Fixed' ) | (enumLiteral_1= 'Revolute' ) | (enumLiteral_2= 'Prismatic' ) | (enumLiteral_3= 'Continuous' ) )
            {
            // InternalDsl.g:2662:2: ( (enumLiteral_0= 'Fixed' ) | (enumLiteral_1= 'Revolute' ) | (enumLiteral_2= 'Prismatic' ) | (enumLiteral_3= 'Continuous' ) )
            int alt52=4;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt52=1;
                }
                break;
            case 73:
                {
                alt52=2;
                }
                break;
            case 74:
                {
                alt52=3;
                }
                break;
            case 75:
                {
                alt52=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // InternalDsl.g:2663:3: (enumLiteral_0= 'Fixed' )
                    {
                    // InternalDsl.g:2663:3: (enumLiteral_0= 'Fixed' )
                    // InternalDsl.g:2664:4: enumLiteral_0= 'Fixed'
                    {
                    enumLiteral_0=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getJointTypeAccess().getFixedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getJointTypeAccess().getFixedEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:2671:3: (enumLiteral_1= 'Revolute' )
                    {
                    // InternalDsl.g:2671:3: (enumLiteral_1= 'Revolute' )
                    // InternalDsl.g:2672:4: enumLiteral_1= 'Revolute'
                    {
                    enumLiteral_1=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getJointTypeAccess().getRevoluteEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getJointTypeAccess().getRevoluteEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:2679:3: (enumLiteral_2= 'Prismatic' )
                    {
                    // InternalDsl.g:2679:3: (enumLiteral_2= 'Prismatic' )
                    // InternalDsl.g:2680:4: enumLiteral_2= 'Prismatic'
                    {
                    enumLiteral_2=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getJointTypeAccess().getPrismaticEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getJointTypeAccess().getPrismaticEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:2687:3: (enumLiteral_3= 'Continuous' )
                    {
                    // InternalDsl.g:2687:3: (enumLiteral_3= 'Continuous' )
                    // InternalDsl.g:2688:4: enumLiteral_3= 'Continuous'
                    {
                    enumLiteral_3=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getJointTypeAccess().getContinuousEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getJointTypeAccess().getContinuousEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJointType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000013000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000011000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000F00L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020FC0002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0020000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000020F80002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020F00002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000F00002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0600000000E00010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000E00002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x1800000000C00010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x2000000000000010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000010L,0x000000000000000FL});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0014A00000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000028000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000100000000010L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000400000000010L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0100000000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000082L,0x0000000000000080L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0600000000000002L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x1800000000000002L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0xC000000000000002L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000EL});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000080L,0x00000000000000C0L});

}