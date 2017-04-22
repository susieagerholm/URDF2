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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RobotName'", "'Link'", "'Joint'", "'Origin'", "'Mass'", "'Inertia'", "'Color'", "'Texture'", "'Box'", "'Cylinder'", "'Mesh'", "'Sphere'", "'Limit'", "'Axis'", "'x'", "'y'", "'z'", "'Calibration'", "'Rising'", "'Falling'", "'Dynamics'", "'Friction'", "'Damping'", "'Mimic'", "'Multiplier'", "'OffSet'", "'SafetyController'", "'SoftLowerLimit'", "'SoftUpperLimit'", "'k_position'", "'k_velocity'", "'.'", "'Revolute'", "'Continous'", "'Fixed'", "'Prismatic'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
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
    // InternalDsl.g:72:1: ruleRobot returns [EObject current=null] : (otherlv_0= 'RobotName' ( (lv_name_1_0= RULE_ID ) ) ( (lv_link_2_0= ruleLink ) )+ ( (lv_joint_3_0= ruleJoint ) )* ) ;
    public final EObject ruleRobot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_link_2_0 = null;

        EObject lv_joint_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:78:2: ( (otherlv_0= 'RobotName' ( (lv_name_1_0= RULE_ID ) ) ( (lv_link_2_0= ruleLink ) )+ ( (lv_joint_3_0= ruleJoint ) )* ) )
            // InternalDsl.g:79:2: (otherlv_0= 'RobotName' ( (lv_name_1_0= RULE_ID ) ) ( (lv_link_2_0= ruleLink ) )+ ( (lv_joint_3_0= ruleJoint ) )* )
            {
            // InternalDsl.g:79:2: (otherlv_0= 'RobotName' ( (lv_name_1_0= RULE_ID ) ) ( (lv_link_2_0= ruleLink ) )+ ( (lv_joint_3_0= ruleJoint ) )* )
            // InternalDsl.g:80:3: otherlv_0= 'RobotName' ( (lv_name_1_0= RULE_ID ) ) ( (lv_link_2_0= ruleLink ) )+ ( (lv_joint_3_0= ruleJoint ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRobotAccess().getRobotNameKeyword_0());
            		
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

            // InternalDsl.g:102:3: ( (lv_link_2_0= ruleLink ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDsl.g:103:4: (lv_link_2_0= ruleLink )
            	    {
            	    // InternalDsl.g:103:4: (lv_link_2_0= ruleLink )
            	    // InternalDsl.g:104:5: lv_link_2_0= ruleLink
            	    {

            	    					newCompositeNode(grammarAccess.getRobotAccess().getLinkLinkParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
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
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // InternalDsl.g:121:3: ( (lv_joint_3_0= ruleJoint ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDsl.g:122:4: (lv_joint_3_0= ruleJoint )
            	    {
            	    // InternalDsl.g:122:4: (lv_joint_3_0= ruleJoint )
            	    // InternalDsl.g:123:5: lv_joint_3_0= ruleJoint
            	    {

            	    					newCompositeNode(grammarAccess.getRobotAccess().getJointJointParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
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
            	    break;

            	default :
            	    break loop2;
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
    // InternalDsl.g:144:1: entryRuleMaterial returns [EObject current=null] : iv_ruleMaterial= ruleMaterial EOF ;
    public final EObject entryRuleMaterial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaterial = null;


        try {
            // InternalDsl.g:144:49: (iv_ruleMaterial= ruleMaterial EOF )
            // InternalDsl.g:145:2: iv_ruleMaterial= ruleMaterial EOF
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
    // InternalDsl.g:151:1: ruleMaterial returns [EObject current=null] : (this_Color_0= ruleColor | this_Texture_1= ruleTexture ) ;
    public final EObject ruleMaterial() throws RecognitionException {
        EObject current = null;

        EObject this_Color_0 = null;

        EObject this_Texture_1 = null;



        	enterRule();

        try {
            // InternalDsl.g:157:2: ( (this_Color_0= ruleColor | this_Texture_1= ruleTexture ) )
            // InternalDsl.g:158:2: (this_Color_0= ruleColor | this_Texture_1= ruleTexture )
            {
            // InternalDsl.g:158:2: (this_Color_0= ruleColor | this_Texture_1= ruleTexture )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            else if ( (LA3_0==18) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDsl.g:159:3: this_Color_0= ruleColor
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
                    // InternalDsl.g:168:3: this_Texture_1= ruleTexture
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
    // InternalDsl.g:180:1: entryRuleGeometry returns [EObject current=null] : iv_ruleGeometry= ruleGeometry EOF ;
    public final EObject entryRuleGeometry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeometry = null;


        try {
            // InternalDsl.g:180:49: (iv_ruleGeometry= ruleGeometry EOF )
            // InternalDsl.g:181:2: iv_ruleGeometry= ruleGeometry EOF
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
    // InternalDsl.g:187:1: ruleGeometry returns [EObject current=null] : (this_Box_0= ruleBox | this_Cylinder_1= ruleCylinder | this_Mesh_2= ruleMesh | this_Sphere_3= ruleSphere ) ;
    public final EObject ruleGeometry() throws RecognitionException {
        EObject current = null;

        EObject this_Box_0 = null;

        EObject this_Cylinder_1 = null;

        EObject this_Mesh_2 = null;

        EObject this_Sphere_3 = null;



        	enterRule();

        try {
            // InternalDsl.g:193:2: ( (this_Box_0= ruleBox | this_Cylinder_1= ruleCylinder | this_Mesh_2= ruleMesh | this_Sphere_3= ruleSphere ) )
            // InternalDsl.g:194:2: (this_Box_0= ruleBox | this_Cylinder_1= ruleCylinder | this_Mesh_2= ruleMesh | this_Sphere_3= ruleSphere )
            {
            // InternalDsl.g:194:2: (this_Box_0= ruleBox | this_Cylinder_1= ruleCylinder | this_Mesh_2= ruleMesh | this_Sphere_3= ruleSphere )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt4=1;
                }
                break;
            case 20:
                {
                alt4=2;
                }
                break;
            case 21:
                {
                alt4=3;
                }
                break;
            case 22:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalDsl.g:195:3: this_Box_0= ruleBox
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
                    // InternalDsl.g:204:3: this_Cylinder_1= ruleCylinder
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
                    // InternalDsl.g:213:3: this_Mesh_2= ruleMesh
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
                    // InternalDsl.g:222:3: this_Sphere_3= ruleSphere
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
    // InternalDsl.g:234:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalDsl.g:234:45: (iv_ruleLink= ruleLink EOF )
            // InternalDsl.g:235:2: iv_ruleLink= ruleLink EOF
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
    // InternalDsl.g:241:1: ruleLink returns [EObject current=null] : ( () otherlv_1= 'Link' ( (lv_name_2_0= RULE_ID ) ) ( (lv_inertial_3_0= ruleInertial ) )* ( (lv_visuals_4_0= ruleVisual ) )* ( (lv_collision_5_0= ruleCollision ) )* ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_inertial_3_0 = null;

        EObject lv_visuals_4_0 = null;

        EObject lv_collision_5_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:247:2: ( ( () otherlv_1= 'Link' ( (lv_name_2_0= RULE_ID ) ) ( (lv_inertial_3_0= ruleInertial ) )* ( (lv_visuals_4_0= ruleVisual ) )* ( (lv_collision_5_0= ruleCollision ) )* ) )
            // InternalDsl.g:248:2: ( () otherlv_1= 'Link' ( (lv_name_2_0= RULE_ID ) ) ( (lv_inertial_3_0= ruleInertial ) )* ( (lv_visuals_4_0= ruleVisual ) )* ( (lv_collision_5_0= ruleCollision ) )* )
            {
            // InternalDsl.g:248:2: ( () otherlv_1= 'Link' ( (lv_name_2_0= RULE_ID ) ) ( (lv_inertial_3_0= ruleInertial ) )* ( (lv_visuals_4_0= ruleVisual ) )* ( (lv_collision_5_0= ruleCollision ) )* )
            // InternalDsl.g:249:3: () otherlv_1= 'Link' ( (lv_name_2_0= RULE_ID ) ) ( (lv_inertial_3_0= ruleInertial ) )* ( (lv_visuals_4_0= ruleVisual ) )* ( (lv_collision_5_0= ruleCollision ) )*
            {
            // InternalDsl.g:249:3: ()
            // InternalDsl.g:250:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLinkAccess().getLinkAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLinkAccess().getLinkKeyword_1());
            		
            // InternalDsl.g:260:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDsl.g:261:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDsl.g:261:4: (lv_name_2_0= RULE_ID )
            // InternalDsl.g:262:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_2_0, grammarAccess.getLinkAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDsl.g:278:3: ( (lv_inertial_3_0= ruleInertial ) )*
            loop5:
            do {
                int alt5=2;
                alt5 = dfa5.predict(input);
                switch (alt5) {
            	case 1 :
            	    // InternalDsl.g:279:4: (lv_inertial_3_0= ruleInertial )
            	    {
            	    // InternalDsl.g:279:4: (lv_inertial_3_0= ruleInertial )
            	    // InternalDsl.g:280:5: lv_inertial_3_0= ruleInertial
            	    {

            	    					newCompositeNode(grammarAccess.getLinkAccess().getInertialInertialParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
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

            // InternalDsl.g:297:3: ( (lv_visuals_4_0= ruleVisual ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14||(LA6_0>=17 && LA6_0<=18)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDsl.g:298:4: (lv_visuals_4_0= ruleVisual )
            	    {
            	    // InternalDsl.g:298:4: (lv_visuals_4_0= ruleVisual )
            	    // InternalDsl.g:299:5: lv_visuals_4_0= ruleVisual
            	    {

            	    					newCompositeNode(grammarAccess.getLinkAccess().getVisualsVisualParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_visuals_4_0=ruleVisual();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLinkRule());
            	    					}
            	    					add(
            	    						current,
            	    						"visuals",
            	    						lv_visuals_4_0,
            	    						"org.xtext.urdf.Dsl.Visual");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalDsl.g:316:3: ( (lv_collision_5_0= ruleCollision ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=19 && LA7_0<=22)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDsl.g:317:4: (lv_collision_5_0= ruleCollision )
            	    {
            	    // InternalDsl.g:317:4: (lv_collision_5_0= ruleCollision )
            	    // InternalDsl.g:318:5: lv_collision_5_0= ruleCollision
            	    {

            	    					newCompositeNode(grammarAccess.getLinkAccess().getCollisionCollisionParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_collision_5_0=ruleCollision();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLinkRule());
            	    					}
            	    					add(
            	    						current,
            	    						"collision",
            	    						lv_collision_5_0,
            	    						"org.xtext.urdf.Dsl.Collision");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalDsl.g:339:1: entryRuleJoint returns [EObject current=null] : iv_ruleJoint= ruleJoint EOF ;
    public final EObject entryRuleJoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoint = null;


        try {
            // InternalDsl.g:339:46: (iv_ruleJoint= ruleJoint EOF )
            // InternalDsl.g:340:2: iv_ruleJoint= ruleJoint EOF
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
    // InternalDsl.g:346:1: ruleJoint returns [EObject current=null] : (otherlv_0= 'Joint' ( (lv_name_1_0= RULE_ID ) ) ( (lv_Type_2_0= ruleJointType ) ) ( (otherlv_3= RULE_STRING ) ) ( (otherlv_4= RULE_STRING ) ) ( (lv_limit_5_0= ruleLimit ) )? ( (lv_axis_6_0= ruleAxis ) )? ( (lv_origin_7_0= ruleOrigin ) ) ( (lv_calibration_8_0= ruleCalibration ) )? ( (lv_dynamics_9_0= ruleDynamics ) )? ( (lv_mimic_10_0= ruleMimic ) )? ( (lv_safetycontroller_11_0= ruleSafetyController ) )? ) ;
    public final EObject ruleJoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Enumerator lv_Type_2_0 = null;

        EObject lv_limit_5_0 = null;

        EObject lv_axis_6_0 = null;

        EObject lv_origin_7_0 = null;

        EObject lv_calibration_8_0 = null;

        EObject lv_dynamics_9_0 = null;

        EObject lv_mimic_10_0 = null;

        EObject lv_safetycontroller_11_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:352:2: ( (otherlv_0= 'Joint' ( (lv_name_1_0= RULE_ID ) ) ( (lv_Type_2_0= ruleJointType ) ) ( (otherlv_3= RULE_STRING ) ) ( (otherlv_4= RULE_STRING ) ) ( (lv_limit_5_0= ruleLimit ) )? ( (lv_axis_6_0= ruleAxis ) )? ( (lv_origin_7_0= ruleOrigin ) ) ( (lv_calibration_8_0= ruleCalibration ) )? ( (lv_dynamics_9_0= ruleDynamics ) )? ( (lv_mimic_10_0= ruleMimic ) )? ( (lv_safetycontroller_11_0= ruleSafetyController ) )? ) )
            // InternalDsl.g:353:2: (otherlv_0= 'Joint' ( (lv_name_1_0= RULE_ID ) ) ( (lv_Type_2_0= ruleJointType ) ) ( (otherlv_3= RULE_STRING ) ) ( (otherlv_4= RULE_STRING ) ) ( (lv_limit_5_0= ruleLimit ) )? ( (lv_axis_6_0= ruleAxis ) )? ( (lv_origin_7_0= ruleOrigin ) ) ( (lv_calibration_8_0= ruleCalibration ) )? ( (lv_dynamics_9_0= ruleDynamics ) )? ( (lv_mimic_10_0= ruleMimic ) )? ( (lv_safetycontroller_11_0= ruleSafetyController ) )? )
            {
            // InternalDsl.g:353:2: (otherlv_0= 'Joint' ( (lv_name_1_0= RULE_ID ) ) ( (lv_Type_2_0= ruleJointType ) ) ( (otherlv_3= RULE_STRING ) ) ( (otherlv_4= RULE_STRING ) ) ( (lv_limit_5_0= ruleLimit ) )? ( (lv_axis_6_0= ruleAxis ) )? ( (lv_origin_7_0= ruleOrigin ) ) ( (lv_calibration_8_0= ruleCalibration ) )? ( (lv_dynamics_9_0= ruleDynamics ) )? ( (lv_mimic_10_0= ruleMimic ) )? ( (lv_safetycontroller_11_0= ruleSafetyController ) )? )
            // InternalDsl.g:354:3: otherlv_0= 'Joint' ( (lv_name_1_0= RULE_ID ) ) ( (lv_Type_2_0= ruleJointType ) ) ( (otherlv_3= RULE_STRING ) ) ( (otherlv_4= RULE_STRING ) ) ( (lv_limit_5_0= ruleLimit ) )? ( (lv_axis_6_0= ruleAxis ) )? ( (lv_origin_7_0= ruleOrigin ) ) ( (lv_calibration_8_0= ruleCalibration ) )? ( (lv_dynamics_9_0= ruleDynamics ) )? ( (lv_mimic_10_0= ruleMimic ) )? ( (lv_safetycontroller_11_0= ruleSafetyController ) )?
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJointAccess().getJointKeyword_0());
            		
            // InternalDsl.g:358:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:359:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:359:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:360:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            // InternalDsl.g:376:3: ( (lv_Type_2_0= ruleJointType ) )
            // InternalDsl.g:377:4: (lv_Type_2_0= ruleJointType )
            {
            // InternalDsl.g:377:4: (lv_Type_2_0= ruleJointType )
            // InternalDsl.g:378:5: lv_Type_2_0= ruleJointType
            {

            					newCompositeNode(grammarAccess.getJointAccess().getTypeJointTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_Type_2_0=ruleJointType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJointRule());
            					}
            					set(
            						current,
            						"Type",
            						lv_Type_2_0,
            						"org.xtext.urdf.Dsl.JointType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:395:3: ( (otherlv_3= RULE_STRING ) )
            // InternalDsl.g:396:4: (otherlv_3= RULE_STRING )
            {
            // InternalDsl.g:396:4: (otherlv_3= RULE_STRING )
            // InternalDsl.g:397:5: otherlv_3= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJointRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(otherlv_3, grammarAccess.getJointAccess().getChildOfLinkCrossReference_3_0());
            				

            }


            }

            // InternalDsl.g:408:3: ( (otherlv_4= RULE_STRING ) )
            // InternalDsl.g:409:4: (otherlv_4= RULE_STRING )
            {
            // InternalDsl.g:409:4: (otherlv_4= RULE_STRING )
            // InternalDsl.g:410:5: otherlv_4= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJointRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(otherlv_4, grammarAccess.getJointAccess().getParentOfLinkCrossReference_4_0());
            				

            }


            }

            // InternalDsl.g:421:3: ( (lv_limit_5_0= ruleLimit ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDsl.g:422:4: (lv_limit_5_0= ruleLimit )
                    {
                    // InternalDsl.g:422:4: (lv_limit_5_0= ruleLimit )
                    // InternalDsl.g:423:5: lv_limit_5_0= ruleLimit
                    {

                    					newCompositeNode(grammarAccess.getJointAccess().getLimitLimitParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_limit_5_0=ruleLimit();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getJointRule());
                    					}
                    					set(
                    						current,
                    						"limit",
                    						lv_limit_5_0,
                    						"org.xtext.urdf.Dsl.Limit");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDsl.g:440:3: ( (lv_axis_6_0= ruleAxis ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDsl.g:441:4: (lv_axis_6_0= ruleAxis )
                    {
                    // InternalDsl.g:441:4: (lv_axis_6_0= ruleAxis )
                    // InternalDsl.g:442:5: lv_axis_6_0= ruleAxis
                    {

                    					newCompositeNode(grammarAccess.getJointAccess().getAxisAxisParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_13);
                    lv_axis_6_0=ruleAxis();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getJointRule());
                    					}
                    					set(
                    						current,
                    						"axis",
                    						lv_axis_6_0,
                    						"org.xtext.urdf.Dsl.Axis");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDsl.g:459:3: ( (lv_origin_7_0= ruleOrigin ) )
            // InternalDsl.g:460:4: (lv_origin_7_0= ruleOrigin )
            {
            // InternalDsl.g:460:4: (lv_origin_7_0= ruleOrigin )
            // InternalDsl.g:461:5: lv_origin_7_0= ruleOrigin
            {

            					newCompositeNode(grammarAccess.getJointAccess().getOriginOriginParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_14);
            lv_origin_7_0=ruleOrigin();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJointRule());
            					}
            					set(
            						current,
            						"origin",
            						lv_origin_7_0,
            						"org.xtext.urdf.Dsl.Origin");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:478:3: ( (lv_calibration_8_0= ruleCalibration ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDsl.g:479:4: (lv_calibration_8_0= ruleCalibration )
                    {
                    // InternalDsl.g:479:4: (lv_calibration_8_0= ruleCalibration )
                    // InternalDsl.g:480:5: lv_calibration_8_0= ruleCalibration
                    {

                    					newCompositeNode(grammarAccess.getJointAccess().getCalibrationCalibrationParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_15);
                    lv_calibration_8_0=ruleCalibration();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getJointRule());
                    					}
                    					set(
                    						current,
                    						"calibration",
                    						lv_calibration_8_0,
                    						"org.xtext.urdf.Dsl.Calibration");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDsl.g:497:3: ( (lv_dynamics_9_0= ruleDynamics ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDsl.g:498:4: (lv_dynamics_9_0= ruleDynamics )
                    {
                    // InternalDsl.g:498:4: (lv_dynamics_9_0= ruleDynamics )
                    // InternalDsl.g:499:5: lv_dynamics_9_0= ruleDynamics
                    {

                    					newCompositeNode(grammarAccess.getJointAccess().getDynamicsDynamicsParserRuleCall_9_0());
                    				
                    pushFollow(FOLLOW_16);
                    lv_dynamics_9_0=ruleDynamics();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getJointRule());
                    					}
                    					set(
                    						current,
                    						"dynamics",
                    						lv_dynamics_9_0,
                    						"org.xtext.urdf.Dsl.Dynamics");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDsl.g:516:3: ( (lv_mimic_10_0= ruleMimic ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==34) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDsl.g:517:4: (lv_mimic_10_0= ruleMimic )
                    {
                    // InternalDsl.g:517:4: (lv_mimic_10_0= ruleMimic )
                    // InternalDsl.g:518:5: lv_mimic_10_0= ruleMimic
                    {

                    					newCompositeNode(grammarAccess.getJointAccess().getMimicMimicParserRuleCall_10_0());
                    				
                    pushFollow(FOLLOW_17);
                    lv_mimic_10_0=ruleMimic();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getJointRule());
                    					}
                    					set(
                    						current,
                    						"mimic",
                    						lv_mimic_10_0,
                    						"org.xtext.urdf.Dsl.Mimic");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDsl.g:535:3: ( (lv_safetycontroller_11_0= ruleSafetyController ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==37) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDsl.g:536:4: (lv_safetycontroller_11_0= ruleSafetyController )
                    {
                    // InternalDsl.g:536:4: (lv_safetycontroller_11_0= ruleSafetyController )
                    // InternalDsl.g:537:5: lv_safetycontroller_11_0= ruleSafetyController
                    {

                    					newCompositeNode(grammarAccess.getJointAccess().getSafetycontrollerSafetyControllerParserRuleCall_11_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_safetycontroller_11_0=ruleSafetyController();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getJointRule());
                    					}
                    					set(
                    						current,
                    						"safetycontroller",
                    						lv_safetycontroller_11_0,
                    						"org.xtext.urdf.Dsl.SafetyController");
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
    // $ANTLR end "ruleJoint"


    // $ANTLR start "entryRuleInertial"
    // InternalDsl.g:558:1: entryRuleInertial returns [EObject current=null] : iv_ruleInertial= ruleInertial EOF ;
    public final EObject entryRuleInertial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInertial = null;


        try {
            // InternalDsl.g:558:49: (iv_ruleInertial= ruleInertial EOF )
            // InternalDsl.g:559:2: iv_ruleInertial= ruleInertial EOF
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
    // InternalDsl.g:565:1: ruleInertial returns [EObject current=null] : ( ( (lv_origin_0_0= ruleOrigin ) ) ( (lv_mass_1_0= ruleMass ) ) ( (lv_inertia_2_0= ruleInertia ) ) ) ;
    public final EObject ruleInertial() throws RecognitionException {
        EObject current = null;

        EObject lv_origin_0_0 = null;

        EObject lv_mass_1_0 = null;

        EObject lv_inertia_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:571:2: ( ( ( (lv_origin_0_0= ruleOrigin ) ) ( (lv_mass_1_0= ruleMass ) ) ( (lv_inertia_2_0= ruleInertia ) ) ) )
            // InternalDsl.g:572:2: ( ( (lv_origin_0_0= ruleOrigin ) ) ( (lv_mass_1_0= ruleMass ) ) ( (lv_inertia_2_0= ruleInertia ) ) )
            {
            // InternalDsl.g:572:2: ( ( (lv_origin_0_0= ruleOrigin ) ) ( (lv_mass_1_0= ruleMass ) ) ( (lv_inertia_2_0= ruleInertia ) ) )
            // InternalDsl.g:573:3: ( (lv_origin_0_0= ruleOrigin ) ) ( (lv_mass_1_0= ruleMass ) ) ( (lv_inertia_2_0= ruleInertia ) )
            {
            // InternalDsl.g:573:3: ( (lv_origin_0_0= ruleOrigin ) )
            // InternalDsl.g:574:4: (lv_origin_0_0= ruleOrigin )
            {
            // InternalDsl.g:574:4: (lv_origin_0_0= ruleOrigin )
            // InternalDsl.g:575:5: lv_origin_0_0= ruleOrigin
            {

            					newCompositeNode(grammarAccess.getInertialAccess().getOriginOriginParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
            lv_origin_0_0=ruleOrigin();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInertialRule());
            					}
            					set(
            						current,
            						"origin",
            						lv_origin_0_0,
            						"org.xtext.urdf.Dsl.Origin");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:592:3: ( (lv_mass_1_0= ruleMass ) )
            // InternalDsl.g:593:4: (lv_mass_1_0= ruleMass )
            {
            // InternalDsl.g:593:4: (lv_mass_1_0= ruleMass )
            // InternalDsl.g:594:5: lv_mass_1_0= ruleMass
            {

            					newCompositeNode(grammarAccess.getInertialAccess().getMassMassParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_mass_1_0=ruleMass();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInertialRule());
            					}
            					set(
            						current,
            						"mass",
            						lv_mass_1_0,
            						"org.xtext.urdf.Dsl.Mass");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:611:3: ( (lv_inertia_2_0= ruleInertia ) )
            // InternalDsl.g:612:4: (lv_inertia_2_0= ruleInertia )
            {
            // InternalDsl.g:612:4: (lv_inertia_2_0= ruleInertia )
            // InternalDsl.g:613:5: lv_inertia_2_0= ruleInertia
            {

            					newCompositeNode(grammarAccess.getInertialAccess().getInertiaInertiaParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
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
    // InternalDsl.g:634:1: entryRuleVisual returns [EObject current=null] : iv_ruleVisual= ruleVisual EOF ;
    public final EObject entryRuleVisual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisual = null;


        try {
            // InternalDsl.g:634:47: (iv_ruleVisual= ruleVisual EOF )
            // InternalDsl.g:635:2: iv_ruleVisual= ruleVisual EOF
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
    // InternalDsl.g:641:1: ruleVisual returns [EObject current=null] : ( ( (lv_material_0_0= ruleMaterial ) )? ( (lv_origin_1_0= ruleOrigin ) ) ( (lv_geometry_2_0= ruleGeometry ) ) ) ;
    public final EObject ruleVisual() throws RecognitionException {
        EObject current = null;

        EObject lv_material_0_0 = null;

        EObject lv_origin_1_0 = null;

        EObject lv_geometry_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:647:2: ( ( ( (lv_material_0_0= ruleMaterial ) )? ( (lv_origin_1_0= ruleOrigin ) ) ( (lv_geometry_2_0= ruleGeometry ) ) ) )
            // InternalDsl.g:648:2: ( ( (lv_material_0_0= ruleMaterial ) )? ( (lv_origin_1_0= ruleOrigin ) ) ( (lv_geometry_2_0= ruleGeometry ) ) )
            {
            // InternalDsl.g:648:2: ( ( (lv_material_0_0= ruleMaterial ) )? ( (lv_origin_1_0= ruleOrigin ) ) ( (lv_geometry_2_0= ruleGeometry ) ) )
            // InternalDsl.g:649:3: ( (lv_material_0_0= ruleMaterial ) )? ( (lv_origin_1_0= ruleOrigin ) ) ( (lv_geometry_2_0= ruleGeometry ) )
            {
            // InternalDsl.g:649:3: ( (lv_material_0_0= ruleMaterial ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=17 && LA14_0<=18)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDsl.g:650:4: (lv_material_0_0= ruleMaterial )
                    {
                    // InternalDsl.g:650:4: (lv_material_0_0= ruleMaterial )
                    // InternalDsl.g:651:5: lv_material_0_0= ruleMaterial
                    {

                    					newCompositeNode(grammarAccess.getVisualAccess().getMaterialMaterialParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_13);
                    lv_material_0_0=ruleMaterial();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVisualRule());
                    					}
                    					set(
                    						current,
                    						"material",
                    						lv_material_0_0,
                    						"org.xtext.urdf.Dsl.Material");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDsl.g:668:3: ( (lv_origin_1_0= ruleOrigin ) )
            // InternalDsl.g:669:4: (lv_origin_1_0= ruleOrigin )
            {
            // InternalDsl.g:669:4: (lv_origin_1_0= ruleOrigin )
            // InternalDsl.g:670:5: lv_origin_1_0= ruleOrigin
            {

            					newCompositeNode(grammarAccess.getVisualAccess().getOriginOriginParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_origin_1_0=ruleOrigin();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVisualRule());
            					}
            					set(
            						current,
            						"origin",
            						lv_origin_1_0,
            						"org.xtext.urdf.Dsl.Origin");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:687:3: ( (lv_geometry_2_0= ruleGeometry ) )
            // InternalDsl.g:688:4: (lv_geometry_2_0= ruleGeometry )
            {
            // InternalDsl.g:688:4: (lv_geometry_2_0= ruleGeometry )
            // InternalDsl.g:689:5: lv_geometry_2_0= ruleGeometry
            {

            					newCompositeNode(grammarAccess.getVisualAccess().getGeometryGeometryParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_geometry_2_0=ruleGeometry();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVisualRule());
            					}
            					set(
            						current,
            						"geometry",
            						lv_geometry_2_0,
            						"org.xtext.urdf.Dsl.Geometry");
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
    // $ANTLR end "ruleVisual"


    // $ANTLR start "entryRuleCollision"
    // InternalDsl.g:710:1: entryRuleCollision returns [EObject current=null] : iv_ruleCollision= ruleCollision EOF ;
    public final EObject entryRuleCollision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollision = null;


        try {
            // InternalDsl.g:710:50: (iv_ruleCollision= ruleCollision EOF )
            // InternalDsl.g:711:2: iv_ruleCollision= ruleCollision EOF
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
    // InternalDsl.g:717:1: ruleCollision returns [EObject current=null] : ( ( (lv_geometry_0_0= ruleGeometry ) ) ( (lv_origin_1_0= ruleOrigin ) ) ) ;
    public final EObject ruleCollision() throws RecognitionException {
        EObject current = null;

        EObject lv_geometry_0_0 = null;

        EObject lv_origin_1_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:723:2: ( ( ( (lv_geometry_0_0= ruleGeometry ) ) ( (lv_origin_1_0= ruleOrigin ) ) ) )
            // InternalDsl.g:724:2: ( ( (lv_geometry_0_0= ruleGeometry ) ) ( (lv_origin_1_0= ruleOrigin ) ) )
            {
            // InternalDsl.g:724:2: ( ( (lv_geometry_0_0= ruleGeometry ) ) ( (lv_origin_1_0= ruleOrigin ) ) )
            // InternalDsl.g:725:3: ( (lv_geometry_0_0= ruleGeometry ) ) ( (lv_origin_1_0= ruleOrigin ) )
            {
            // InternalDsl.g:725:3: ( (lv_geometry_0_0= ruleGeometry ) )
            // InternalDsl.g:726:4: (lv_geometry_0_0= ruleGeometry )
            {
            // InternalDsl.g:726:4: (lv_geometry_0_0= ruleGeometry )
            // InternalDsl.g:727:5: lv_geometry_0_0= ruleGeometry
            {

            					newCompositeNode(grammarAccess.getCollisionAccess().getGeometryGeometryParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_13);
            lv_geometry_0_0=ruleGeometry();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCollisionRule());
            					}
            					set(
            						current,
            						"geometry",
            						lv_geometry_0_0,
            						"org.xtext.urdf.Dsl.Geometry");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:744:3: ( (lv_origin_1_0= ruleOrigin ) )
            // InternalDsl.g:745:4: (lv_origin_1_0= ruleOrigin )
            {
            // InternalDsl.g:745:4: (lv_origin_1_0= ruleOrigin )
            // InternalDsl.g:746:5: lv_origin_1_0= ruleOrigin
            {

            					newCompositeNode(grammarAccess.getCollisionAccess().getOriginOriginParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_origin_1_0=ruleOrigin();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCollisionRule());
            					}
            					set(
            						current,
            						"origin",
            						lv_origin_1_0,
            						"org.xtext.urdf.Dsl.Origin");
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
    // $ANTLR end "ruleCollision"


    // $ANTLR start "entryRuleOrigin"
    // InternalDsl.g:767:1: entryRuleOrigin returns [EObject current=null] : iv_ruleOrigin= ruleOrigin EOF ;
    public final EObject entryRuleOrigin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrigin = null;


        try {
            // InternalDsl.g:767:47: (iv_ruleOrigin= ruleOrigin EOF )
            // InternalDsl.g:768:2: iv_ruleOrigin= ruleOrigin EOF
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
    // InternalDsl.g:774:1: ruleOrigin returns [EObject current=null] : ( () otherlv_1= 'Origin' ( (lv_x_2_0= ruleFLOAT ) )? ( (lv_y_3_0= ruleFLOAT ) )? ( (lv_z_4_0= ruleFLOAT ) )? ( (lv_roll_5_0= ruleFLOAT ) )? ( (lv_pitch_6_0= ruleFLOAT ) )? ( (lv_yaw_7_0= ruleFLOAT ) )? ) ;
    public final EObject ruleOrigin() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_x_2_0 = null;

        AntlrDatatypeRuleToken lv_y_3_0 = null;

        AntlrDatatypeRuleToken lv_z_4_0 = null;

        AntlrDatatypeRuleToken lv_roll_5_0 = null;

        AntlrDatatypeRuleToken lv_pitch_6_0 = null;

        AntlrDatatypeRuleToken lv_yaw_7_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:780:2: ( ( () otherlv_1= 'Origin' ( (lv_x_2_0= ruleFLOAT ) )? ( (lv_y_3_0= ruleFLOAT ) )? ( (lv_z_4_0= ruleFLOAT ) )? ( (lv_roll_5_0= ruleFLOAT ) )? ( (lv_pitch_6_0= ruleFLOAT ) )? ( (lv_yaw_7_0= ruleFLOAT ) )? ) )
            // InternalDsl.g:781:2: ( () otherlv_1= 'Origin' ( (lv_x_2_0= ruleFLOAT ) )? ( (lv_y_3_0= ruleFLOAT ) )? ( (lv_z_4_0= ruleFLOAT ) )? ( (lv_roll_5_0= ruleFLOAT ) )? ( (lv_pitch_6_0= ruleFLOAT ) )? ( (lv_yaw_7_0= ruleFLOAT ) )? )
            {
            // InternalDsl.g:781:2: ( () otherlv_1= 'Origin' ( (lv_x_2_0= ruleFLOAT ) )? ( (lv_y_3_0= ruleFLOAT ) )? ( (lv_z_4_0= ruleFLOAT ) )? ( (lv_roll_5_0= ruleFLOAT ) )? ( (lv_pitch_6_0= ruleFLOAT ) )? ( (lv_yaw_7_0= ruleFLOAT ) )? )
            // InternalDsl.g:782:3: () otherlv_1= 'Origin' ( (lv_x_2_0= ruleFLOAT ) )? ( (lv_y_3_0= ruleFLOAT ) )? ( (lv_z_4_0= ruleFLOAT ) )? ( (lv_roll_5_0= ruleFLOAT ) )? ( (lv_pitch_6_0= ruleFLOAT ) )? ( (lv_yaw_7_0= ruleFLOAT ) )?
            {
            // InternalDsl.g:782:3: ()
            // InternalDsl.g:783:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOriginAccess().getOriginAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getOriginAccess().getOriginKeyword_1());
            		
            // InternalDsl.g:793:3: ( (lv_x_2_0= ruleFLOAT ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INT) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==42) ) {
                    int LA15_3 = input.LA(3);

                    if ( (LA15_3==RULE_INT) ) {
                        alt15=1;
                    }
                }
            }
            switch (alt15) {
                case 1 :
                    // InternalDsl.g:794:4: (lv_x_2_0= ruleFLOAT )
                    {
                    // InternalDsl.g:794:4: (lv_x_2_0= ruleFLOAT )
                    // InternalDsl.g:795:5: lv_x_2_0= ruleFLOAT
                    {

                    					newCompositeNode(grammarAccess.getOriginAccess().getXFLOATParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_21);
                    lv_x_2_0=ruleFLOAT();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getOriginRule());
                    					}
                    					set(
                    						current,
                    						"x",
                    						lv_x_2_0,
                    						"org.xtext.urdf.Dsl.FLOAT");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDsl.g:812:3: ( (lv_y_3_0= ruleFLOAT ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==42) ) {
                    int LA16_3 = input.LA(3);

                    if ( (LA16_3==RULE_INT) ) {
                        alt16=1;
                    }
                }
            }
            switch (alt16) {
                case 1 :
                    // InternalDsl.g:813:4: (lv_y_3_0= ruleFLOAT )
                    {
                    // InternalDsl.g:813:4: (lv_y_3_0= ruleFLOAT )
                    // InternalDsl.g:814:5: lv_y_3_0= ruleFLOAT
                    {

                    					newCompositeNode(grammarAccess.getOriginAccess().getYFLOATParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_21);
                    lv_y_3_0=ruleFLOAT();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getOriginRule());
                    					}
                    					set(
                    						current,
                    						"y",
                    						lv_y_3_0,
                    						"org.xtext.urdf.Dsl.FLOAT");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDsl.g:831:3: ( (lv_z_4_0= ruleFLOAT ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INT) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==42) ) {
                    int LA17_3 = input.LA(3);

                    if ( (LA17_3==RULE_INT) ) {
                        alt17=1;
                    }
                }
            }
            switch (alt17) {
                case 1 :
                    // InternalDsl.g:832:4: (lv_z_4_0= ruleFLOAT )
                    {
                    // InternalDsl.g:832:4: (lv_z_4_0= ruleFLOAT )
                    // InternalDsl.g:833:5: lv_z_4_0= ruleFLOAT
                    {

                    					newCompositeNode(grammarAccess.getOriginAccess().getZFLOATParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_21);
                    lv_z_4_0=ruleFLOAT();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getOriginRule());
                    					}
                    					set(
                    						current,
                    						"z",
                    						lv_z_4_0,
                    						"org.xtext.urdf.Dsl.FLOAT");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDsl.g:850:3: ( (lv_roll_5_0= ruleFLOAT ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_INT) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==42) ) {
                    int LA18_3 = input.LA(3);

                    if ( (LA18_3==RULE_INT) ) {
                        alt18=1;
                    }
                }
            }
            switch (alt18) {
                case 1 :
                    // InternalDsl.g:851:4: (lv_roll_5_0= ruleFLOAT )
                    {
                    // InternalDsl.g:851:4: (lv_roll_5_0= ruleFLOAT )
                    // InternalDsl.g:852:5: lv_roll_5_0= ruleFLOAT
                    {

                    					newCompositeNode(grammarAccess.getOriginAccess().getRollFLOATParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_21);
                    lv_roll_5_0=ruleFLOAT();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getOriginRule());
                    					}
                    					set(
                    						current,
                    						"roll",
                    						lv_roll_5_0,
                    						"org.xtext.urdf.Dsl.FLOAT");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDsl.g:869:3: ( (lv_pitch_6_0= ruleFLOAT ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_INT) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==42) ) {
                    int LA19_3 = input.LA(3);

                    if ( (LA19_3==RULE_INT) ) {
                        alt19=1;
                    }
                }
            }
            switch (alt19) {
                case 1 :
                    // InternalDsl.g:870:4: (lv_pitch_6_0= ruleFLOAT )
                    {
                    // InternalDsl.g:870:4: (lv_pitch_6_0= ruleFLOAT )
                    // InternalDsl.g:871:5: lv_pitch_6_0= ruleFLOAT
                    {

                    					newCompositeNode(grammarAccess.getOriginAccess().getPitchFLOATParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_21);
                    lv_pitch_6_0=ruleFLOAT();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getOriginRule());
                    					}
                    					set(
                    						current,
                    						"pitch",
                    						lv_pitch_6_0,
                    						"org.xtext.urdf.Dsl.FLOAT");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDsl.g:888:3: ( (lv_yaw_7_0= ruleFLOAT ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_INT) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDsl.g:889:4: (lv_yaw_7_0= ruleFLOAT )
                    {
                    // InternalDsl.g:889:4: (lv_yaw_7_0= ruleFLOAT )
                    // InternalDsl.g:890:5: lv_yaw_7_0= ruleFLOAT
                    {

                    					newCompositeNode(grammarAccess.getOriginAccess().getYawFLOATParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_yaw_7_0=ruleFLOAT();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getOriginRule());
                    					}
                    					set(
                    						current,
                    						"yaw",
                    						lv_yaw_7_0,
                    						"org.xtext.urdf.Dsl.FLOAT");
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
    // $ANTLR end "ruleOrigin"


    // $ANTLR start "entryRuleMass"
    // InternalDsl.g:911:1: entryRuleMass returns [EObject current=null] : iv_ruleMass= ruleMass EOF ;
    public final EObject entryRuleMass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMass = null;


        try {
            // InternalDsl.g:911:45: (iv_ruleMass= ruleMass EOF )
            // InternalDsl.g:912:2: iv_ruleMass= ruleMass EOF
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
    // InternalDsl.g:918:1: ruleMass returns [EObject current=null] : ( () otherlv_1= 'Mass' ) ;
    public final EObject ruleMass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:924:2: ( ( () otherlv_1= 'Mass' ) )
            // InternalDsl.g:925:2: ( () otherlv_1= 'Mass' )
            {
            // InternalDsl.g:925:2: ( () otherlv_1= 'Mass' )
            // InternalDsl.g:926:3: () otherlv_1= 'Mass'
            {
            // InternalDsl.g:926:3: ()
            // InternalDsl.g:927:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMassAccess().getMassAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getMassAccess().getMassKeyword_1());
            		

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
    // InternalDsl.g:941:1: entryRuleInertia returns [EObject current=null] : iv_ruleInertia= ruleInertia EOF ;
    public final EObject entryRuleInertia() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInertia = null;


        try {
            // InternalDsl.g:941:48: (iv_ruleInertia= ruleInertia EOF )
            // InternalDsl.g:942:2: iv_ruleInertia= ruleInertia EOF
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
    // InternalDsl.g:948:1: ruleInertia returns [EObject current=null] : ( () otherlv_1= 'Inertia' ) ;
    public final EObject ruleInertia() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:954:2: ( ( () otherlv_1= 'Inertia' ) )
            // InternalDsl.g:955:2: ( () otherlv_1= 'Inertia' )
            {
            // InternalDsl.g:955:2: ( () otherlv_1= 'Inertia' )
            // InternalDsl.g:956:3: () otherlv_1= 'Inertia'
            {
            // InternalDsl.g:956:3: ()
            // InternalDsl.g:957:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInertiaAccess().getInertiaAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getInertiaAccess().getInertiaKeyword_1());
            		

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
    // InternalDsl.g:971:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // InternalDsl.g:971:46: (iv_ruleColor= ruleColor EOF )
            // InternalDsl.g:972:2: iv_ruleColor= ruleColor EOF
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
    // InternalDsl.g:978:1: ruleColor returns [EObject current=null] : ( () otherlv_1= 'Color' ) ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:984:2: ( ( () otherlv_1= 'Color' ) )
            // InternalDsl.g:985:2: ( () otherlv_1= 'Color' )
            {
            // InternalDsl.g:985:2: ( () otherlv_1= 'Color' )
            // InternalDsl.g:986:3: () otherlv_1= 'Color'
            {
            // InternalDsl.g:986:3: ()
            // InternalDsl.g:987:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getColorAccess().getColorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getColorAccess().getColorKeyword_1());
            		

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
    // InternalDsl.g:1001:1: entryRuleTexture returns [EObject current=null] : iv_ruleTexture= ruleTexture EOF ;
    public final EObject entryRuleTexture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTexture = null;


        try {
            // InternalDsl.g:1001:48: (iv_ruleTexture= ruleTexture EOF )
            // InternalDsl.g:1002:2: iv_ruleTexture= ruleTexture EOF
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
    // InternalDsl.g:1008:1: ruleTexture returns [EObject current=null] : ( () otherlv_1= 'Texture' ) ;
    public final EObject ruleTexture() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1014:2: ( ( () otherlv_1= 'Texture' ) )
            // InternalDsl.g:1015:2: ( () otherlv_1= 'Texture' )
            {
            // InternalDsl.g:1015:2: ( () otherlv_1= 'Texture' )
            // InternalDsl.g:1016:3: () otherlv_1= 'Texture'
            {
            // InternalDsl.g:1016:3: ()
            // InternalDsl.g:1017:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTextureAccess().getTextureAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getTextureAccess().getTextureKeyword_1());
            		

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
    // InternalDsl.g:1031:1: entryRuleBox returns [EObject current=null] : iv_ruleBox= ruleBox EOF ;
    public final EObject entryRuleBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBox = null;


        try {
            // InternalDsl.g:1031:44: (iv_ruleBox= ruleBox EOF )
            // InternalDsl.g:1032:2: iv_ruleBox= ruleBox EOF
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
    // InternalDsl.g:1038:1: ruleBox returns [EObject current=null] : ( () otherlv_1= 'Box' ) ;
    public final EObject ruleBox() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1044:2: ( ( () otherlv_1= 'Box' ) )
            // InternalDsl.g:1045:2: ( () otherlv_1= 'Box' )
            {
            // InternalDsl.g:1045:2: ( () otherlv_1= 'Box' )
            // InternalDsl.g:1046:3: () otherlv_1= 'Box'
            {
            // InternalDsl.g:1046:3: ()
            // InternalDsl.g:1047:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBoxAccess().getBoxAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getBoxAccess().getBoxKeyword_1());
            		

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
    // InternalDsl.g:1061:1: entryRuleCylinder returns [EObject current=null] : iv_ruleCylinder= ruleCylinder EOF ;
    public final EObject entryRuleCylinder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCylinder = null;


        try {
            // InternalDsl.g:1061:49: (iv_ruleCylinder= ruleCylinder EOF )
            // InternalDsl.g:1062:2: iv_ruleCylinder= ruleCylinder EOF
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
    // InternalDsl.g:1068:1: ruleCylinder returns [EObject current=null] : ( () otherlv_1= 'Cylinder' ) ;
    public final EObject ruleCylinder() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1074:2: ( ( () otherlv_1= 'Cylinder' ) )
            // InternalDsl.g:1075:2: ( () otherlv_1= 'Cylinder' )
            {
            // InternalDsl.g:1075:2: ( () otherlv_1= 'Cylinder' )
            // InternalDsl.g:1076:3: () otherlv_1= 'Cylinder'
            {
            // InternalDsl.g:1076:3: ()
            // InternalDsl.g:1077:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCylinderAccess().getCylinderAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getCylinderAccess().getCylinderKeyword_1());
            		

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
    // InternalDsl.g:1091:1: entryRuleMesh returns [EObject current=null] : iv_ruleMesh= ruleMesh EOF ;
    public final EObject entryRuleMesh() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMesh = null;


        try {
            // InternalDsl.g:1091:45: (iv_ruleMesh= ruleMesh EOF )
            // InternalDsl.g:1092:2: iv_ruleMesh= ruleMesh EOF
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
    // InternalDsl.g:1098:1: ruleMesh returns [EObject current=null] : ( () otherlv_1= 'Mesh' ) ;
    public final EObject ruleMesh() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1104:2: ( ( () otherlv_1= 'Mesh' ) )
            // InternalDsl.g:1105:2: ( () otherlv_1= 'Mesh' )
            {
            // InternalDsl.g:1105:2: ( () otherlv_1= 'Mesh' )
            // InternalDsl.g:1106:3: () otherlv_1= 'Mesh'
            {
            // InternalDsl.g:1106:3: ()
            // InternalDsl.g:1107:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMeshAccess().getMeshAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getMeshAccess().getMeshKeyword_1());
            		

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
    // InternalDsl.g:1121:1: entryRuleSphere returns [EObject current=null] : iv_ruleSphere= ruleSphere EOF ;
    public final EObject entryRuleSphere() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSphere = null;


        try {
            // InternalDsl.g:1121:47: (iv_ruleSphere= ruleSphere EOF )
            // InternalDsl.g:1122:2: iv_ruleSphere= ruleSphere EOF
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
    // InternalDsl.g:1128:1: ruleSphere returns [EObject current=null] : ( () otherlv_1= 'Sphere' ) ;
    public final EObject ruleSphere() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1134:2: ( ( () otherlv_1= 'Sphere' ) )
            // InternalDsl.g:1135:2: ( () otherlv_1= 'Sphere' )
            {
            // InternalDsl.g:1135:2: ( () otherlv_1= 'Sphere' )
            // InternalDsl.g:1136:3: () otherlv_1= 'Sphere'
            {
            // InternalDsl.g:1136:3: ()
            // InternalDsl.g:1137:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSphereAccess().getSphereAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getSphereAccess().getSphereKeyword_1());
            		

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
    // InternalDsl.g:1151:1: entryRuleLimit returns [EObject current=null] : iv_ruleLimit= ruleLimit EOF ;
    public final EObject entryRuleLimit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLimit = null;


        try {
            // InternalDsl.g:1151:46: (iv_ruleLimit= ruleLimit EOF )
            // InternalDsl.g:1152:2: iv_ruleLimit= ruleLimit EOF
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
    // InternalDsl.g:1158:1: ruleLimit returns [EObject current=null] : ( () otherlv_1= 'Limit' ( (lv_lower_2_0= ruleFLOAT ) )? ( (lv_upper_3_0= ruleFLOAT ) )? ( (lv_effort_4_0= ruleFLOAT ) )? ( (lv_velocity_5_0= ruleFLOAT ) )? ) ;
    public final EObject ruleLimit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_lower_2_0 = null;

        AntlrDatatypeRuleToken lv_upper_3_0 = null;

        AntlrDatatypeRuleToken lv_effort_4_0 = null;

        AntlrDatatypeRuleToken lv_velocity_5_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1164:2: ( ( () otherlv_1= 'Limit' ( (lv_lower_2_0= ruleFLOAT ) )? ( (lv_upper_3_0= ruleFLOAT ) )? ( (lv_effort_4_0= ruleFLOAT ) )? ( (lv_velocity_5_0= ruleFLOAT ) )? ) )
            // InternalDsl.g:1165:2: ( () otherlv_1= 'Limit' ( (lv_lower_2_0= ruleFLOAT ) )? ( (lv_upper_3_0= ruleFLOAT ) )? ( (lv_effort_4_0= ruleFLOAT ) )? ( (lv_velocity_5_0= ruleFLOAT ) )? )
            {
            // InternalDsl.g:1165:2: ( () otherlv_1= 'Limit' ( (lv_lower_2_0= ruleFLOAT ) )? ( (lv_upper_3_0= ruleFLOAT ) )? ( (lv_effort_4_0= ruleFLOAT ) )? ( (lv_velocity_5_0= ruleFLOAT ) )? )
            // InternalDsl.g:1166:3: () otherlv_1= 'Limit' ( (lv_lower_2_0= ruleFLOAT ) )? ( (lv_upper_3_0= ruleFLOAT ) )? ( (lv_effort_4_0= ruleFLOAT ) )? ( (lv_velocity_5_0= ruleFLOAT ) )?
            {
            // InternalDsl.g:1166:3: ()
            // InternalDsl.g:1167:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLimitAccess().getLimitAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getLimitAccess().getLimitKeyword_1());
            		
            // InternalDsl.g:1177:3: ( (lv_lower_2_0= ruleFLOAT ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_INT) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==42) ) {
                    int LA21_3 = input.LA(3);

                    if ( (LA21_3==RULE_INT) ) {
                        alt21=1;
                    }
                }
            }
            switch (alt21) {
                case 1 :
                    // InternalDsl.g:1178:4: (lv_lower_2_0= ruleFLOAT )
                    {
                    // InternalDsl.g:1178:4: (lv_lower_2_0= ruleFLOAT )
                    // InternalDsl.g:1179:5: lv_lower_2_0= ruleFLOAT
                    {

                    					newCompositeNode(grammarAccess.getLimitAccess().getLowerFLOATParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_21);
                    lv_lower_2_0=ruleFLOAT();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLimitRule());
                    					}
                    					set(
                    						current,
                    						"lower",
                    						lv_lower_2_0,
                    						"org.xtext.urdf.Dsl.FLOAT");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDsl.g:1196:3: ( (lv_upper_3_0= ruleFLOAT ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_INT) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==42) ) {
                    int LA22_3 = input.LA(3);

                    if ( (LA22_3==RULE_INT) ) {
                        alt22=1;
                    }
                }
            }
            switch (alt22) {
                case 1 :
                    // InternalDsl.g:1197:4: (lv_upper_3_0= ruleFLOAT )
                    {
                    // InternalDsl.g:1197:4: (lv_upper_3_0= ruleFLOAT )
                    // InternalDsl.g:1198:5: lv_upper_3_0= ruleFLOAT
                    {

                    					newCompositeNode(grammarAccess.getLimitAccess().getUpperFLOATParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_21);
                    lv_upper_3_0=ruleFLOAT();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLimitRule());
                    					}
                    					set(
                    						current,
                    						"upper",
                    						lv_upper_3_0,
                    						"org.xtext.urdf.Dsl.FLOAT");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDsl.g:1215:3: ( (lv_effort_4_0= ruleFLOAT ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_INT) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==42) ) {
                    int LA23_3 = input.LA(3);

                    if ( (LA23_3==RULE_INT) ) {
                        alt23=1;
                    }
                }
            }
            switch (alt23) {
                case 1 :
                    // InternalDsl.g:1216:4: (lv_effort_4_0= ruleFLOAT )
                    {
                    // InternalDsl.g:1216:4: (lv_effort_4_0= ruleFLOAT )
                    // InternalDsl.g:1217:5: lv_effort_4_0= ruleFLOAT
                    {

                    					newCompositeNode(grammarAccess.getLimitAccess().getEffortFLOATParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_21);
                    lv_effort_4_0=ruleFLOAT();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLimitRule());
                    					}
                    					set(
                    						current,
                    						"effort",
                    						lv_effort_4_0,
                    						"org.xtext.urdf.Dsl.FLOAT");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDsl.g:1234:3: ( (lv_velocity_5_0= ruleFLOAT ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_INT) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDsl.g:1235:4: (lv_velocity_5_0= ruleFLOAT )
                    {
                    // InternalDsl.g:1235:4: (lv_velocity_5_0= ruleFLOAT )
                    // InternalDsl.g:1236:5: lv_velocity_5_0= ruleFLOAT
                    {

                    					newCompositeNode(grammarAccess.getLimitAccess().getVelocityFLOATParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_velocity_5_0=ruleFLOAT();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLimitRule());
                    					}
                    					set(
                    						current,
                    						"velocity",
                    						lv_velocity_5_0,
                    						"org.xtext.urdf.Dsl.FLOAT");
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
    // InternalDsl.g:1257:1: entryRuleAxis returns [EObject current=null] : iv_ruleAxis= ruleAxis EOF ;
    public final EObject entryRuleAxis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAxis = null;


        try {
            // InternalDsl.g:1257:45: (iv_ruleAxis= ruleAxis EOF )
            // InternalDsl.g:1258:2: iv_ruleAxis= ruleAxis EOF
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
    // InternalDsl.g:1264:1: ruleAxis returns [EObject current=null] : ( () otherlv_1= 'Axis' (otherlv_2= 'x' ( (lv_x_3_0= RULE_INT ) ) )? (otherlv_4= 'y' ( (lv_y_5_0= RULE_INT ) ) )? (otherlv_6= 'z' ( (lv_z_7_0= RULE_INT ) ) )? ) ;
    public final EObject ruleAxis() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_x_3_0=null;
        Token otherlv_4=null;
        Token lv_y_5_0=null;
        Token otherlv_6=null;
        Token lv_z_7_0=null;


        	enterRule();

        try {
            // InternalDsl.g:1270:2: ( ( () otherlv_1= 'Axis' (otherlv_2= 'x' ( (lv_x_3_0= RULE_INT ) ) )? (otherlv_4= 'y' ( (lv_y_5_0= RULE_INT ) ) )? (otherlv_6= 'z' ( (lv_z_7_0= RULE_INT ) ) )? ) )
            // InternalDsl.g:1271:2: ( () otherlv_1= 'Axis' (otherlv_2= 'x' ( (lv_x_3_0= RULE_INT ) ) )? (otherlv_4= 'y' ( (lv_y_5_0= RULE_INT ) ) )? (otherlv_6= 'z' ( (lv_z_7_0= RULE_INT ) ) )? )
            {
            // InternalDsl.g:1271:2: ( () otherlv_1= 'Axis' (otherlv_2= 'x' ( (lv_x_3_0= RULE_INT ) ) )? (otherlv_4= 'y' ( (lv_y_5_0= RULE_INT ) ) )? (otherlv_6= 'z' ( (lv_z_7_0= RULE_INT ) ) )? )
            // InternalDsl.g:1272:3: () otherlv_1= 'Axis' (otherlv_2= 'x' ( (lv_x_3_0= RULE_INT ) ) )? (otherlv_4= 'y' ( (lv_y_5_0= RULE_INT ) ) )? (otherlv_6= 'z' ( (lv_z_7_0= RULE_INT ) ) )?
            {
            // InternalDsl.g:1272:3: ()
            // InternalDsl.g:1273:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAxisAccess().getAxisAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getAxisAccess().getAxisKeyword_1());
            		
            // InternalDsl.g:1283:3: (otherlv_2= 'x' ( (lv_x_3_0= RULE_INT ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==25) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDsl.g:1284:4: otherlv_2= 'x' ( (lv_x_3_0= RULE_INT ) )
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_23); 

                    				newLeafNode(otherlv_2, grammarAccess.getAxisAccess().getXKeyword_2_0());
                    			
                    // InternalDsl.g:1288:4: ( (lv_x_3_0= RULE_INT ) )
                    // InternalDsl.g:1289:5: (lv_x_3_0= RULE_INT )
                    {
                    // InternalDsl.g:1289:5: (lv_x_3_0= RULE_INT )
                    // InternalDsl.g:1290:6: lv_x_3_0= RULE_INT
                    {
                    lv_x_3_0=(Token)match(input,RULE_INT,FOLLOW_24); 

                    						newLeafNode(lv_x_3_0, grammarAccess.getAxisAccess().getXINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAxisRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"x",
                    							lv_x_3_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1307:3: (otherlv_4= 'y' ( (lv_y_5_0= RULE_INT ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==26) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalDsl.g:1308:4: otherlv_4= 'y' ( (lv_y_5_0= RULE_INT ) )
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_23); 

                    				newLeafNode(otherlv_4, grammarAccess.getAxisAccess().getYKeyword_3_0());
                    			
                    // InternalDsl.g:1312:4: ( (lv_y_5_0= RULE_INT ) )
                    // InternalDsl.g:1313:5: (lv_y_5_0= RULE_INT )
                    {
                    // InternalDsl.g:1313:5: (lv_y_5_0= RULE_INT )
                    // InternalDsl.g:1314:6: lv_y_5_0= RULE_INT
                    {
                    lv_y_5_0=(Token)match(input,RULE_INT,FOLLOW_25); 

                    						newLeafNode(lv_y_5_0, grammarAccess.getAxisAccess().getYINTTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAxisRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"y",
                    							lv_y_5_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1331:3: (otherlv_6= 'z' ( (lv_z_7_0= RULE_INT ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==27) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalDsl.g:1332:4: otherlv_6= 'z' ( (lv_z_7_0= RULE_INT ) )
                    {
                    otherlv_6=(Token)match(input,27,FOLLOW_23); 

                    				newLeafNode(otherlv_6, grammarAccess.getAxisAccess().getZKeyword_4_0());
                    			
                    // InternalDsl.g:1336:4: ( (lv_z_7_0= RULE_INT ) )
                    // InternalDsl.g:1337:5: (lv_z_7_0= RULE_INT )
                    {
                    // InternalDsl.g:1337:5: (lv_z_7_0= RULE_INT )
                    // InternalDsl.g:1338:6: lv_z_7_0= RULE_INT
                    {
                    lv_z_7_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_z_7_0, grammarAccess.getAxisAccess().getZINTTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAxisRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"z",
                    							lv_z_7_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

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
    // $ANTLR end "ruleAxis"


    // $ANTLR start "entryRuleCalibration"
    // InternalDsl.g:1359:1: entryRuleCalibration returns [EObject current=null] : iv_ruleCalibration= ruleCalibration EOF ;
    public final EObject entryRuleCalibration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalibration = null;


        try {
            // InternalDsl.g:1359:52: (iv_ruleCalibration= ruleCalibration EOF )
            // InternalDsl.g:1360:2: iv_ruleCalibration= ruleCalibration EOF
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
    // InternalDsl.g:1366:1: ruleCalibration returns [EObject current=null] : ( () otherlv_1= 'Calibration' (otherlv_2= 'Rising' ( (lv_rising_3_0= ruleFLOAT ) ) )? (otherlv_4= 'Falling' ( (lv_falling_5_0= ruleFLOAT ) ) )? ) ;
    public final EObject ruleCalibration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_rising_3_0 = null;

        AntlrDatatypeRuleToken lv_falling_5_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1372:2: ( ( () otherlv_1= 'Calibration' (otherlv_2= 'Rising' ( (lv_rising_3_0= ruleFLOAT ) ) )? (otherlv_4= 'Falling' ( (lv_falling_5_0= ruleFLOAT ) ) )? ) )
            // InternalDsl.g:1373:2: ( () otherlv_1= 'Calibration' (otherlv_2= 'Rising' ( (lv_rising_3_0= ruleFLOAT ) ) )? (otherlv_4= 'Falling' ( (lv_falling_5_0= ruleFLOAT ) ) )? )
            {
            // InternalDsl.g:1373:2: ( () otherlv_1= 'Calibration' (otherlv_2= 'Rising' ( (lv_rising_3_0= ruleFLOAT ) ) )? (otherlv_4= 'Falling' ( (lv_falling_5_0= ruleFLOAT ) ) )? )
            // InternalDsl.g:1374:3: () otherlv_1= 'Calibration' (otherlv_2= 'Rising' ( (lv_rising_3_0= ruleFLOAT ) ) )? (otherlv_4= 'Falling' ( (lv_falling_5_0= ruleFLOAT ) ) )?
            {
            // InternalDsl.g:1374:3: ()
            // InternalDsl.g:1375:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCalibrationAccess().getCalibrationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getCalibrationAccess().getCalibrationKeyword_1());
            		
            // InternalDsl.g:1385:3: (otherlv_2= 'Rising' ( (lv_rising_3_0= ruleFLOAT ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==29) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalDsl.g:1386:4: otherlv_2= 'Rising' ( (lv_rising_3_0= ruleFLOAT ) )
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_23); 

                    				newLeafNode(otherlv_2, grammarAccess.getCalibrationAccess().getRisingKeyword_2_0());
                    			
                    // InternalDsl.g:1390:4: ( (lv_rising_3_0= ruleFLOAT ) )
                    // InternalDsl.g:1391:5: (lv_rising_3_0= ruleFLOAT )
                    {
                    // InternalDsl.g:1391:5: (lv_rising_3_0= ruleFLOAT )
                    // InternalDsl.g:1392:6: lv_rising_3_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getCalibrationAccess().getRisingFLOATParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_rising_3_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCalibrationRule());
                    						}
                    						set(
                    							current,
                    							"rising",
                    							lv_rising_3_0,
                    							"org.xtext.urdf.Dsl.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1410:3: (otherlv_4= 'Falling' ( (lv_falling_5_0= ruleFLOAT ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==30) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalDsl.g:1411:4: otherlv_4= 'Falling' ( (lv_falling_5_0= ruleFLOAT ) )
                    {
                    otherlv_4=(Token)match(input,30,FOLLOW_23); 

                    				newLeafNode(otherlv_4, grammarAccess.getCalibrationAccess().getFallingKeyword_3_0());
                    			
                    // InternalDsl.g:1415:4: ( (lv_falling_5_0= ruleFLOAT ) )
                    // InternalDsl.g:1416:5: (lv_falling_5_0= ruleFLOAT )
                    {
                    // InternalDsl.g:1416:5: (lv_falling_5_0= ruleFLOAT )
                    // InternalDsl.g:1417:6: lv_falling_5_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getCalibrationAccess().getFallingFLOATParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_falling_5_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCalibrationRule());
                    						}
                    						set(
                    							current,
                    							"falling",
                    							lv_falling_5_0,
                    							"org.xtext.urdf.Dsl.FLOAT");
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
    // InternalDsl.g:1439:1: entryRuleDynamics returns [EObject current=null] : iv_ruleDynamics= ruleDynamics EOF ;
    public final EObject entryRuleDynamics() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDynamics = null;


        try {
            // InternalDsl.g:1439:49: (iv_ruleDynamics= ruleDynamics EOF )
            // InternalDsl.g:1440:2: iv_ruleDynamics= ruleDynamics EOF
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
    // InternalDsl.g:1446:1: ruleDynamics returns [EObject current=null] : ( () otherlv_1= 'Dynamics' (otherlv_2= 'Friction' ( (lv_friction_3_0= ruleFLOAT ) ) )? (otherlv_4= 'Damping' ( (lv_damping_5_0= ruleFLOAT ) ) )? ) ;
    public final EObject ruleDynamics() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_friction_3_0 = null;

        AntlrDatatypeRuleToken lv_damping_5_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1452:2: ( ( () otherlv_1= 'Dynamics' (otherlv_2= 'Friction' ( (lv_friction_3_0= ruleFLOAT ) ) )? (otherlv_4= 'Damping' ( (lv_damping_5_0= ruleFLOAT ) ) )? ) )
            // InternalDsl.g:1453:2: ( () otherlv_1= 'Dynamics' (otherlv_2= 'Friction' ( (lv_friction_3_0= ruleFLOAT ) ) )? (otherlv_4= 'Damping' ( (lv_damping_5_0= ruleFLOAT ) ) )? )
            {
            // InternalDsl.g:1453:2: ( () otherlv_1= 'Dynamics' (otherlv_2= 'Friction' ( (lv_friction_3_0= ruleFLOAT ) ) )? (otherlv_4= 'Damping' ( (lv_damping_5_0= ruleFLOAT ) ) )? )
            // InternalDsl.g:1454:3: () otherlv_1= 'Dynamics' (otherlv_2= 'Friction' ( (lv_friction_3_0= ruleFLOAT ) ) )? (otherlv_4= 'Damping' ( (lv_damping_5_0= ruleFLOAT ) ) )?
            {
            // InternalDsl.g:1454:3: ()
            // InternalDsl.g:1455:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDynamicsAccess().getDynamicsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getDynamicsAccess().getDynamicsKeyword_1());
            		
            // InternalDsl.g:1465:3: (otherlv_2= 'Friction' ( (lv_friction_3_0= ruleFLOAT ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==32) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalDsl.g:1466:4: otherlv_2= 'Friction' ( (lv_friction_3_0= ruleFLOAT ) )
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_23); 

                    				newLeafNode(otherlv_2, grammarAccess.getDynamicsAccess().getFrictionKeyword_2_0());
                    			
                    // InternalDsl.g:1470:4: ( (lv_friction_3_0= ruleFLOAT ) )
                    // InternalDsl.g:1471:5: (lv_friction_3_0= ruleFLOAT )
                    {
                    // InternalDsl.g:1471:5: (lv_friction_3_0= ruleFLOAT )
                    // InternalDsl.g:1472:6: lv_friction_3_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getDynamicsAccess().getFrictionFLOATParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_friction_3_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDynamicsRule());
                    						}
                    						set(
                    							current,
                    							"friction",
                    							lv_friction_3_0,
                    							"org.xtext.urdf.Dsl.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1490:3: (otherlv_4= 'Damping' ( (lv_damping_5_0= ruleFLOAT ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==33) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalDsl.g:1491:4: otherlv_4= 'Damping' ( (lv_damping_5_0= ruleFLOAT ) )
                    {
                    otherlv_4=(Token)match(input,33,FOLLOW_23); 

                    				newLeafNode(otherlv_4, grammarAccess.getDynamicsAccess().getDampingKeyword_3_0());
                    			
                    // InternalDsl.g:1495:4: ( (lv_damping_5_0= ruleFLOAT ) )
                    // InternalDsl.g:1496:5: (lv_damping_5_0= ruleFLOAT )
                    {
                    // InternalDsl.g:1496:5: (lv_damping_5_0= ruleFLOAT )
                    // InternalDsl.g:1497:6: lv_damping_5_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getDynamicsAccess().getDampingFLOATParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_damping_5_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDynamicsRule());
                    						}
                    						set(
                    							current,
                    							"damping",
                    							lv_damping_5_0,
                    							"org.xtext.urdf.Dsl.FLOAT");
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
    // InternalDsl.g:1519:1: entryRuleMimic returns [EObject current=null] : iv_ruleMimic= ruleMimic EOF ;
    public final EObject entryRuleMimic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMimic = null;


        try {
            // InternalDsl.g:1519:46: (iv_ruleMimic= ruleMimic EOF )
            // InternalDsl.g:1520:2: iv_ruleMimic= ruleMimic EOF
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
    // InternalDsl.g:1526:1: ruleMimic returns [EObject current=null] : ( () otherlv_1= 'Mimic' (otherlv_2= 'Multiplier' ( (lv_multiplier_3_0= ruleFLOAT ) ) )? (otherlv_4= 'OffSet' ( (lv_offSet_5_0= ruleFLOAT ) ) )? ) ;
    public final EObject ruleMimic() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_multiplier_3_0 = null;

        AntlrDatatypeRuleToken lv_offSet_5_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1532:2: ( ( () otherlv_1= 'Mimic' (otherlv_2= 'Multiplier' ( (lv_multiplier_3_0= ruleFLOAT ) ) )? (otherlv_4= 'OffSet' ( (lv_offSet_5_0= ruleFLOAT ) ) )? ) )
            // InternalDsl.g:1533:2: ( () otherlv_1= 'Mimic' (otherlv_2= 'Multiplier' ( (lv_multiplier_3_0= ruleFLOAT ) ) )? (otherlv_4= 'OffSet' ( (lv_offSet_5_0= ruleFLOAT ) ) )? )
            {
            // InternalDsl.g:1533:2: ( () otherlv_1= 'Mimic' (otherlv_2= 'Multiplier' ( (lv_multiplier_3_0= ruleFLOAT ) ) )? (otherlv_4= 'OffSet' ( (lv_offSet_5_0= ruleFLOAT ) ) )? )
            // InternalDsl.g:1534:3: () otherlv_1= 'Mimic' (otherlv_2= 'Multiplier' ( (lv_multiplier_3_0= ruleFLOAT ) ) )? (otherlv_4= 'OffSet' ( (lv_offSet_5_0= ruleFLOAT ) ) )?
            {
            // InternalDsl.g:1534:3: ()
            // InternalDsl.g:1535:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMimicAccess().getMimicAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getMimicAccess().getMimicKeyword_1());
            		
            // InternalDsl.g:1545:3: (otherlv_2= 'Multiplier' ( (lv_multiplier_3_0= ruleFLOAT ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==35) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalDsl.g:1546:4: otherlv_2= 'Multiplier' ( (lv_multiplier_3_0= ruleFLOAT ) )
                    {
                    otherlv_2=(Token)match(input,35,FOLLOW_23); 

                    				newLeafNode(otherlv_2, grammarAccess.getMimicAccess().getMultiplierKeyword_2_0());
                    			
                    // InternalDsl.g:1550:4: ( (lv_multiplier_3_0= ruleFLOAT ) )
                    // InternalDsl.g:1551:5: (lv_multiplier_3_0= ruleFLOAT )
                    {
                    // InternalDsl.g:1551:5: (lv_multiplier_3_0= ruleFLOAT )
                    // InternalDsl.g:1552:6: lv_multiplier_3_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getMimicAccess().getMultiplierFLOATParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_multiplier_3_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMimicRule());
                    						}
                    						set(
                    							current,
                    							"multiplier",
                    							lv_multiplier_3_0,
                    							"org.xtext.urdf.Dsl.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1570:3: (otherlv_4= 'OffSet' ( (lv_offSet_5_0= ruleFLOAT ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==36) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalDsl.g:1571:4: otherlv_4= 'OffSet' ( (lv_offSet_5_0= ruleFLOAT ) )
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_23); 

                    				newLeafNode(otherlv_4, grammarAccess.getMimicAccess().getOffSetKeyword_3_0());
                    			
                    // InternalDsl.g:1575:4: ( (lv_offSet_5_0= ruleFLOAT ) )
                    // InternalDsl.g:1576:5: (lv_offSet_5_0= ruleFLOAT )
                    {
                    // InternalDsl.g:1576:5: (lv_offSet_5_0= ruleFLOAT )
                    // InternalDsl.g:1577:6: lv_offSet_5_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getMimicAccess().getOffSetFLOATParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_offSet_5_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMimicRule());
                    						}
                    						set(
                    							current,
                    							"offSet",
                    							lv_offSet_5_0,
                    							"org.xtext.urdf.Dsl.FLOAT");
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
    // InternalDsl.g:1599:1: entryRuleSafetyController returns [EObject current=null] : iv_ruleSafetyController= ruleSafetyController EOF ;
    public final EObject entryRuleSafetyController() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSafetyController = null;


        try {
            // InternalDsl.g:1599:57: (iv_ruleSafetyController= ruleSafetyController EOF )
            // InternalDsl.g:1600:2: iv_ruleSafetyController= ruleSafetyController EOF
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
    // InternalDsl.g:1606:1: ruleSafetyController returns [EObject current=null] : ( () otherlv_1= 'SafetyController' (otherlv_2= 'SoftLowerLimit' ( (lv_softLowerLimit_3_0= ruleFLOAT ) ) )? (otherlv_4= 'SoftUpperLimit' ( (lv_softUpperLimit_5_0= ruleFLOAT ) ) )? (otherlv_6= 'k_position' ( (lv_k_position_7_0= ruleFLOAT ) ) )? (otherlv_8= 'k_velocity' ( (lv_k_velocity_9_0= ruleFLOAT ) ) )? ) ;
    public final EObject ruleSafetyController() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_softLowerLimit_3_0 = null;

        AntlrDatatypeRuleToken lv_softUpperLimit_5_0 = null;

        AntlrDatatypeRuleToken lv_k_position_7_0 = null;

        AntlrDatatypeRuleToken lv_k_velocity_9_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1612:2: ( ( () otherlv_1= 'SafetyController' (otherlv_2= 'SoftLowerLimit' ( (lv_softLowerLimit_3_0= ruleFLOAT ) ) )? (otherlv_4= 'SoftUpperLimit' ( (lv_softUpperLimit_5_0= ruleFLOAT ) ) )? (otherlv_6= 'k_position' ( (lv_k_position_7_0= ruleFLOAT ) ) )? (otherlv_8= 'k_velocity' ( (lv_k_velocity_9_0= ruleFLOAT ) ) )? ) )
            // InternalDsl.g:1613:2: ( () otherlv_1= 'SafetyController' (otherlv_2= 'SoftLowerLimit' ( (lv_softLowerLimit_3_0= ruleFLOAT ) ) )? (otherlv_4= 'SoftUpperLimit' ( (lv_softUpperLimit_5_0= ruleFLOAT ) ) )? (otherlv_6= 'k_position' ( (lv_k_position_7_0= ruleFLOAT ) ) )? (otherlv_8= 'k_velocity' ( (lv_k_velocity_9_0= ruleFLOAT ) ) )? )
            {
            // InternalDsl.g:1613:2: ( () otherlv_1= 'SafetyController' (otherlv_2= 'SoftLowerLimit' ( (lv_softLowerLimit_3_0= ruleFLOAT ) ) )? (otherlv_4= 'SoftUpperLimit' ( (lv_softUpperLimit_5_0= ruleFLOAT ) ) )? (otherlv_6= 'k_position' ( (lv_k_position_7_0= ruleFLOAT ) ) )? (otherlv_8= 'k_velocity' ( (lv_k_velocity_9_0= ruleFLOAT ) ) )? )
            // InternalDsl.g:1614:3: () otherlv_1= 'SafetyController' (otherlv_2= 'SoftLowerLimit' ( (lv_softLowerLimit_3_0= ruleFLOAT ) ) )? (otherlv_4= 'SoftUpperLimit' ( (lv_softUpperLimit_5_0= ruleFLOAT ) ) )? (otherlv_6= 'k_position' ( (lv_k_position_7_0= ruleFLOAT ) ) )? (otherlv_8= 'k_velocity' ( (lv_k_velocity_9_0= ruleFLOAT ) ) )?
            {
            // InternalDsl.g:1614:3: ()
            // InternalDsl.g:1615:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSafetyControllerAccess().getSafetyControllerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getSafetyControllerAccess().getSafetyControllerKeyword_1());
            		
            // InternalDsl.g:1625:3: (otherlv_2= 'SoftLowerLimit' ( (lv_softLowerLimit_3_0= ruleFLOAT ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==38) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalDsl.g:1626:4: otherlv_2= 'SoftLowerLimit' ( (lv_softLowerLimit_3_0= ruleFLOAT ) )
                    {
                    otherlv_2=(Token)match(input,38,FOLLOW_23); 

                    				newLeafNode(otherlv_2, grammarAccess.getSafetyControllerAccess().getSoftLowerLimitKeyword_2_0());
                    			
                    // InternalDsl.g:1630:4: ( (lv_softLowerLimit_3_0= ruleFLOAT ) )
                    // InternalDsl.g:1631:5: (lv_softLowerLimit_3_0= ruleFLOAT )
                    {
                    // InternalDsl.g:1631:5: (lv_softLowerLimit_3_0= ruleFLOAT )
                    // InternalDsl.g:1632:6: lv_softLowerLimit_3_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getSafetyControllerAccess().getSoftLowerLimitFLOATParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_softLowerLimit_3_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSafetyControllerRule());
                    						}
                    						set(
                    							current,
                    							"softLowerLimit",
                    							lv_softLowerLimit_3_0,
                    							"org.xtext.urdf.Dsl.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1650:3: (otherlv_4= 'SoftUpperLimit' ( (lv_softUpperLimit_5_0= ruleFLOAT ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==39) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalDsl.g:1651:4: otherlv_4= 'SoftUpperLimit' ( (lv_softUpperLimit_5_0= ruleFLOAT ) )
                    {
                    otherlv_4=(Token)match(input,39,FOLLOW_23); 

                    				newLeafNode(otherlv_4, grammarAccess.getSafetyControllerAccess().getSoftUpperLimitKeyword_3_0());
                    			
                    // InternalDsl.g:1655:4: ( (lv_softUpperLimit_5_0= ruleFLOAT ) )
                    // InternalDsl.g:1656:5: (lv_softUpperLimit_5_0= ruleFLOAT )
                    {
                    // InternalDsl.g:1656:5: (lv_softUpperLimit_5_0= ruleFLOAT )
                    // InternalDsl.g:1657:6: lv_softUpperLimit_5_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getSafetyControllerAccess().getSoftUpperLimitFLOATParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_softUpperLimit_5_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSafetyControllerRule());
                    						}
                    						set(
                    							current,
                    							"softUpperLimit",
                    							lv_softUpperLimit_5_0,
                    							"org.xtext.urdf.Dsl.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1675:3: (otherlv_6= 'k_position' ( (lv_k_position_7_0= ruleFLOAT ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==40) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalDsl.g:1676:4: otherlv_6= 'k_position' ( (lv_k_position_7_0= ruleFLOAT ) )
                    {
                    otherlv_6=(Token)match(input,40,FOLLOW_23); 

                    				newLeafNode(otherlv_6, grammarAccess.getSafetyControllerAccess().getK_positionKeyword_4_0());
                    			
                    // InternalDsl.g:1680:4: ( (lv_k_position_7_0= ruleFLOAT ) )
                    // InternalDsl.g:1681:5: (lv_k_position_7_0= ruleFLOAT )
                    {
                    // InternalDsl.g:1681:5: (lv_k_position_7_0= ruleFLOAT )
                    // InternalDsl.g:1682:6: lv_k_position_7_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getSafetyControllerAccess().getK_positionFLOATParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_k_position_7_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSafetyControllerRule());
                    						}
                    						set(
                    							current,
                    							"k_position",
                    							lv_k_position_7_0,
                    							"org.xtext.urdf.Dsl.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1700:3: (otherlv_8= 'k_velocity' ( (lv_k_velocity_9_0= ruleFLOAT ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==41) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalDsl.g:1701:4: otherlv_8= 'k_velocity' ( (lv_k_velocity_9_0= ruleFLOAT ) )
                    {
                    otherlv_8=(Token)match(input,41,FOLLOW_23); 

                    				newLeafNode(otherlv_8, grammarAccess.getSafetyControllerAccess().getK_velocityKeyword_5_0());
                    			
                    // InternalDsl.g:1705:4: ( (lv_k_velocity_9_0= ruleFLOAT ) )
                    // InternalDsl.g:1706:5: (lv_k_velocity_9_0= ruleFLOAT )
                    {
                    // InternalDsl.g:1706:5: (lv_k_velocity_9_0= ruleFLOAT )
                    // InternalDsl.g:1707:6: lv_k_velocity_9_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getSafetyControllerAccess().getK_velocityFLOATParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_k_velocity_9_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSafetyControllerRule());
                    						}
                    						set(
                    							current,
                    							"k_velocity",
                    							lv_k_velocity_9_0,
                    							"org.xtext.urdf.Dsl.FLOAT");
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
    // $ANTLR end "ruleSafetyController"


    // $ANTLR start "entryRuleFLOAT"
    // InternalDsl.g:1729:1: entryRuleFLOAT returns [String current=null] : iv_ruleFLOAT= ruleFLOAT EOF ;
    public final String entryRuleFLOAT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFLOAT = null;


        try {
            // InternalDsl.g:1729:45: (iv_ruleFLOAT= ruleFLOAT EOF )
            // InternalDsl.g:1730:2: iv_ruleFLOAT= ruleFLOAT EOF
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
    // InternalDsl.g:1736:1: ruleFLOAT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleFLOAT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalDsl.g:1742:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalDsl.g:1743:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalDsl.g:1743:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalDsl.g:1744:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_36); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getFLOATAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,42,FOLLOW_23); 

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


    // $ANTLR start "ruleJointType"
    // InternalDsl.g:1767:1: ruleJointType returns [Enumerator current=null] : ( (enumLiteral_0= 'Revolute' ) | (enumLiteral_1= 'Continous' ) | (enumLiteral_2= 'Fixed' ) | (enumLiteral_3= 'Prismatic' ) ) ;
    public final Enumerator ruleJointType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDsl.g:1773:2: ( ( (enumLiteral_0= 'Revolute' ) | (enumLiteral_1= 'Continous' ) | (enumLiteral_2= 'Fixed' ) | (enumLiteral_3= 'Prismatic' ) ) )
            // InternalDsl.g:1774:2: ( (enumLiteral_0= 'Revolute' ) | (enumLiteral_1= 'Continous' ) | (enumLiteral_2= 'Fixed' ) | (enumLiteral_3= 'Prismatic' ) )
            {
            // InternalDsl.g:1774:2: ( (enumLiteral_0= 'Revolute' ) | (enumLiteral_1= 'Continous' ) | (enumLiteral_2= 'Fixed' ) | (enumLiteral_3= 'Prismatic' ) )
            int alt38=4;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt38=1;
                }
                break;
            case 44:
                {
                alt38=2;
                }
                break;
            case 45:
                {
                alt38=3;
                }
                break;
            case 46:
                {
                alt38=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalDsl.g:1775:3: (enumLiteral_0= 'Revolute' )
                    {
                    // InternalDsl.g:1775:3: (enumLiteral_0= 'Revolute' )
                    // InternalDsl.g:1776:4: enumLiteral_0= 'Revolute'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getJointTypeAccess().getRevoluteEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getJointTypeAccess().getRevoluteEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1783:3: (enumLiteral_1= 'Continous' )
                    {
                    // InternalDsl.g:1783:3: (enumLiteral_1= 'Continous' )
                    // InternalDsl.g:1784:4: enumLiteral_1= 'Continous'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getJointTypeAccess().getContinousEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getJointTypeAccess().getContinousEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:1791:3: (enumLiteral_2= 'Fixed' )
                    {
                    // InternalDsl.g:1791:3: (enumLiteral_2= 'Fixed' )
                    // InternalDsl.g:1792:4: enumLiteral_2= 'Fixed'
                    {
                    enumLiteral_2=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getJointTypeAccess().getFixedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getJointTypeAccess().getFixedEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:1799:3: (enumLiteral_3= 'Prismatic' )
                    {
                    // InternalDsl.g:1799:3: (enumLiteral_3= 'Prismatic' )
                    // InternalDsl.g:1800:4: enumLiteral_3= 'Prismatic'
                    {
                    enumLiteral_3=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getJointTypeAccess().getPrismaticEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getJointTypeAccess().getPrismaticEnumLiteralDeclaration_3());
                    			

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


    protected DFA5 dfa5 = new DFA5(this);
    static final String dfa_1s = "\26\uffff";
    static final String dfa_2s = "\1\1\25\uffff";
    static final String dfa_3s = "\1\14\1\uffff\1\6\1\52\1\uffff\2\6\1\52\2\6\1\52\2\6\1\52\2\6\1\52\2\6\1\52\1\6\1\17";
    static final String dfa_4s = "\1\26\1\uffff\1\26\1\52\1\uffff\1\6\1\26\1\52\1\6\1\26\1\52\1\6\1\26\1\52\1\6\1\26\1\52\1\6\1\26\1\52\1\6\1\26";
    static final String dfa_5s = "\1\uffff\1\2\2\uffff\1\1\21\uffff";
    static final String dfa_6s = "\26\uffff}>";
    static final String[] dfa_7s = {
            "\2\1\1\2\2\uffff\6\1",
            "",
            "\1\3\10\uffff\1\4\3\uffff\4\1",
            "\1\5",
            "",
            "\1\6",
            "\1\7\10\uffff\1\4\3\uffff\4\1",
            "\1\10",
            "\1\11",
            "\1\12\10\uffff\1\4\3\uffff\4\1",
            "\1\13",
            "\1\14",
            "\1\15\10\uffff\1\4\3\uffff\4\1",
            "\1\16",
            "\1\17",
            "\1\20\10\uffff\1\4\3\uffff\4\1",
            "\1\21",
            "\1\22",
            "\1\23\10\uffff\1\4\3\uffff\4\1",
            "\1\24",
            "\1\25",
            "\1\4\3\uffff\4\1"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 278:3: ( (lv_inertial_3_0= ruleInertial ) )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000007E4002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000780002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000780000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001804000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000002490000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000002480000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000002400000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000780000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000003C000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000038000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000040000000000L});

}