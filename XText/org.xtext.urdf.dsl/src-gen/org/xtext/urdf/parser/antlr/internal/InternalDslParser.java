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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RobotName'", "'Link'", "'Joint'", "'Origin'", "'x'", "'y'", "'z'", "'roll'", "'pitch'", "'yaw'", "'Mass'", "'massValueInKilograms'", "'Inertia'", "'ixx'", "'ixy'", "'ixz'", "'iyy'", "'iyz'", "'izz'", "'Color'", "'red'", "'green'", "'blue'", "'alpha'", "'Texture'", "'pathToFile'", "'Box'", "'height'", "'length'", "'width'", "'Cylinder'", "'radius'", "'Mesh'", "'box'", "'Sphere'", "'Limit'", "'lower'", "'upper'", "'effort'", "'velocity'", "'Axis'", "'Calibration'", "'rising'", "'falling'", "'Dynamics'", "'friction'", "'damping'", "'Mimic'", "'multiplier'", "'offSet'", "'mimics'", "'SafetyController'", "'softLowerLimit'", "'softUpperLimit'", "'k_position'", "'k_velocity'", "'.'", "'Revolute'", "'Continous'", "'Fixed'", "'Prismatic'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
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
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
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

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==35) ) {
                    alt3=2;
                }
                else if ( (LA3_1==30) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
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
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 37:
                    {
                    alt4=1;
                    }
                    break;
                case 45:
                    {
                    alt4=4;
                    }
                    break;
                case 43:
                    {
                    alt4=3;
                    }
                    break;
                case 41:
                    {
                    alt4=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }

            }
            else {
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

                if ( (LA6_0==RULE_ID) ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1==RULE_ID) ) {
                        int LA6_3 = input.LA(3);

                        if ( (LA6_3==30||LA6_3==35) ) {
                            alt6=1;
                        }


                    }
                    else if ( (LA6_1==14) ) {
                        alt6=1;
                    }


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

                if ( (LA7_0==RULE_ID) ) {
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
            	    				
            	    pushFollow(FOLLOW_7);
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

            // InternalDsl.g:376:3: ( (lv_Type_2_0= ruleJointType ) )
            // InternalDsl.g:377:4: (lv_Type_2_0= ruleJointType )
            {
            // InternalDsl.g:377:4: (lv_Type_2_0= ruleJointType )
            // InternalDsl.g:378:5: lv_Type_2_0= ruleJointType
            {

            					newCompositeNode(grammarAccess.getJointAccess().getTypeJointTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
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
            				
            otherlv_3=(Token)match(input,RULE_STRING,FOLLOW_9); 

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
            				
            otherlv_4=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(otherlv_4, grammarAccess.getJointAccess().getParentOfLinkCrossReference_4_0());
            				

            }


            }

            // InternalDsl.g:421:3: ( (lv_limit_5_0= ruleLimit ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==46) ) {
                    alt8=1;
                }
            }
            switch (alt8) {
                case 1 :
                    // InternalDsl.g:422:4: (lv_limit_5_0= ruleLimit )
                    {
                    // InternalDsl.g:422:4: (lv_limit_5_0= ruleLimit )
                    // InternalDsl.g:423:5: lv_limit_5_0= ruleLimit
                    {

                    					newCompositeNode(grammarAccess.getJointAccess().getLimitLimitParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_10);
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

            if ( (LA9_0==RULE_ID) ) {
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
                    				
                    pushFollow(FOLLOW_10);
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
            				
            pushFollow(FOLLOW_7);
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

            if ( (LA10_0==RULE_ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==52) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // InternalDsl.g:479:4: (lv_calibration_8_0= ruleCalibration )
                    {
                    // InternalDsl.g:479:4: (lv_calibration_8_0= ruleCalibration )
                    // InternalDsl.g:480:5: lv_calibration_8_0= ruleCalibration
                    {

                    					newCompositeNode(grammarAccess.getJointAccess().getCalibrationCalibrationParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_7);
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

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==55) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // InternalDsl.g:498:4: (lv_dynamics_9_0= ruleDynamics )
                    {
                    // InternalDsl.g:498:4: (lv_dynamics_9_0= ruleDynamics )
                    // InternalDsl.g:499:5: lv_dynamics_9_0= ruleDynamics
                    {

                    					newCompositeNode(grammarAccess.getJointAccess().getDynamicsDynamicsParserRuleCall_9_0());
                    				
                    pushFollow(FOLLOW_7);
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

            if ( (LA12_0==RULE_ID) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==58) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // InternalDsl.g:517:4: (lv_mimic_10_0= ruleMimic )
                    {
                    // InternalDsl.g:517:4: (lv_mimic_10_0= ruleMimic )
                    // InternalDsl.g:518:5: lv_mimic_10_0= ruleMimic
                    {

                    					newCompositeNode(grammarAccess.getJointAccess().getMimicMimicParserRuleCall_10_0());
                    				
                    pushFollow(FOLLOW_7);
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

            if ( (LA13_0==RULE_ID) ) {
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
    // InternalDsl.g:565:1: ruleInertial returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_origin_1_0= ruleOrigin ) ) ( (lv_mass_2_0= ruleMass ) ) ( (lv_inertia_3_0= ruleInertia ) ) ) ;
    public final EObject ruleInertial() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_origin_1_0 = null;

        EObject lv_mass_2_0 = null;

        EObject lv_inertia_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:571:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_origin_1_0= ruleOrigin ) ) ( (lv_mass_2_0= ruleMass ) ) ( (lv_inertia_3_0= ruleInertia ) ) ) )
            // InternalDsl.g:572:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_origin_1_0= ruleOrigin ) ) ( (lv_mass_2_0= ruleMass ) ) ( (lv_inertia_3_0= ruleInertia ) ) )
            {
            // InternalDsl.g:572:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_origin_1_0= ruleOrigin ) ) ( (lv_mass_2_0= ruleMass ) ) ( (lv_inertia_3_0= ruleInertia ) ) )
            // InternalDsl.g:573:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_origin_1_0= ruleOrigin ) ) ( (lv_mass_2_0= ruleMass ) ) ( (lv_inertia_3_0= ruleInertia ) )
            {
            // InternalDsl.g:573:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDsl.g:574:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDsl.g:574:4: (lv_name_0_0= RULE_ID )
            // InternalDsl.g:575:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_0_0, grammarAccess.getInertialAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInertialRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDsl.g:591:3: ( (lv_origin_1_0= ruleOrigin ) )
            // InternalDsl.g:592:4: (lv_origin_1_0= ruleOrigin )
            {
            // InternalDsl.g:592:4: (lv_origin_1_0= ruleOrigin )
            // InternalDsl.g:593:5: lv_origin_1_0= ruleOrigin
            {

            					newCompositeNode(grammarAccess.getInertialAccess().getOriginOriginParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_origin_1_0=ruleOrigin();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInertialRule());
            					}
            					set(
            						current,
            						"origin",
            						lv_origin_1_0,
            						"org.xtext.urdf.Dsl.Origin");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:610:3: ( (lv_mass_2_0= ruleMass ) )
            // InternalDsl.g:611:4: (lv_mass_2_0= ruleMass )
            {
            // InternalDsl.g:611:4: (lv_mass_2_0= ruleMass )
            // InternalDsl.g:612:5: lv_mass_2_0= ruleMass
            {

            					newCompositeNode(grammarAccess.getInertialAccess().getMassMassParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_mass_2_0=ruleMass();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInertialRule());
            					}
            					set(
            						current,
            						"mass",
            						lv_mass_2_0,
            						"org.xtext.urdf.Dsl.Mass");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:629:3: ( (lv_inertia_3_0= ruleInertia ) )
            // InternalDsl.g:630:4: (lv_inertia_3_0= ruleInertia )
            {
            // InternalDsl.g:630:4: (lv_inertia_3_0= ruleInertia )
            // InternalDsl.g:631:5: lv_inertia_3_0= ruleInertia
            {

            					newCompositeNode(grammarAccess.getInertialAccess().getInertiaInertiaParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_inertia_3_0=ruleInertia();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInertialRule());
            					}
            					set(
            						current,
            						"inertia",
            						lv_inertia_3_0,
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
    // InternalDsl.g:652:1: entryRuleVisual returns [EObject current=null] : iv_ruleVisual= ruleVisual EOF ;
    public final EObject entryRuleVisual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisual = null;


        try {
            // InternalDsl.g:652:47: (iv_ruleVisual= ruleVisual EOF )
            // InternalDsl.g:653:2: iv_ruleVisual= ruleVisual EOF
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
    // InternalDsl.g:659:1: ruleVisual returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_material_1_0= ruleMaterial ) )? ( (lv_origin_2_0= ruleOrigin ) ) ( (lv_geometry_3_0= ruleGeometry ) ) ) ;
    public final EObject ruleVisual() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_material_1_0 = null;

        EObject lv_origin_2_0 = null;

        EObject lv_geometry_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:665:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_material_1_0= ruleMaterial ) )? ( (lv_origin_2_0= ruleOrigin ) ) ( (lv_geometry_3_0= ruleGeometry ) ) ) )
            // InternalDsl.g:666:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_material_1_0= ruleMaterial ) )? ( (lv_origin_2_0= ruleOrigin ) ) ( (lv_geometry_3_0= ruleGeometry ) ) )
            {
            // InternalDsl.g:666:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_material_1_0= ruleMaterial ) )? ( (lv_origin_2_0= ruleOrigin ) ) ( (lv_geometry_3_0= ruleGeometry ) ) )
            // InternalDsl.g:667:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_material_1_0= ruleMaterial ) )? ( (lv_origin_2_0= ruleOrigin ) ) ( (lv_geometry_3_0= ruleGeometry ) )
            {
            // InternalDsl.g:667:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDsl.g:668:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDsl.g:668:4: (lv_name_0_0= RULE_ID )
            // InternalDsl.g:669:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_0_0, grammarAccess.getVisualAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVisualRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDsl.g:685:3: ( (lv_material_1_0= ruleMaterial ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDsl.g:686:4: (lv_material_1_0= ruleMaterial )
                    {
                    // InternalDsl.g:686:4: (lv_material_1_0= ruleMaterial )
                    // InternalDsl.g:687:5: lv_material_1_0= ruleMaterial
                    {

                    					newCompositeNode(grammarAccess.getVisualAccess().getMaterialMaterialParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_10);
                    lv_material_1_0=ruleMaterial();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVisualRule());
                    					}
                    					set(
                    						current,
                    						"material",
                    						lv_material_1_0,
                    						"org.xtext.urdf.Dsl.Material");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDsl.g:704:3: ( (lv_origin_2_0= ruleOrigin ) )
            // InternalDsl.g:705:4: (lv_origin_2_0= ruleOrigin )
            {
            // InternalDsl.g:705:4: (lv_origin_2_0= ruleOrigin )
            // InternalDsl.g:706:5: lv_origin_2_0= ruleOrigin
            {

            					newCompositeNode(grammarAccess.getVisualAccess().getOriginOriginParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_origin_2_0=ruleOrigin();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVisualRule());
            					}
            					set(
            						current,
            						"origin",
            						lv_origin_2_0,
            						"org.xtext.urdf.Dsl.Origin");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:723:3: ( (lv_geometry_3_0= ruleGeometry ) )
            // InternalDsl.g:724:4: (lv_geometry_3_0= ruleGeometry )
            {
            // InternalDsl.g:724:4: (lv_geometry_3_0= ruleGeometry )
            // InternalDsl.g:725:5: lv_geometry_3_0= ruleGeometry
            {

            					newCompositeNode(grammarAccess.getVisualAccess().getGeometryGeometryParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
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
    // InternalDsl.g:746:1: entryRuleCollision returns [EObject current=null] : iv_ruleCollision= ruleCollision EOF ;
    public final EObject entryRuleCollision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollision = null;


        try {
            // InternalDsl.g:746:50: (iv_ruleCollision= ruleCollision EOF )
            // InternalDsl.g:747:2: iv_ruleCollision= ruleCollision EOF
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
    // InternalDsl.g:753:1: ruleCollision returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_geometry_1_0= ruleGeometry ) ) ( (lv_origin_2_0= ruleOrigin ) ) ) ;
    public final EObject ruleCollision() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_geometry_1_0 = null;

        EObject lv_origin_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:759:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_geometry_1_0= ruleGeometry ) ) ( (lv_origin_2_0= ruleOrigin ) ) ) )
            // InternalDsl.g:760:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_geometry_1_0= ruleGeometry ) ) ( (lv_origin_2_0= ruleOrigin ) ) )
            {
            // InternalDsl.g:760:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_geometry_1_0= ruleGeometry ) ) ( (lv_origin_2_0= ruleOrigin ) ) )
            // InternalDsl.g:761:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_geometry_1_0= ruleGeometry ) ) ( (lv_origin_2_0= ruleOrigin ) )
            {
            // InternalDsl.g:761:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDsl.g:762:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDsl.g:762:4: (lv_name_0_0= RULE_ID )
            // InternalDsl.g:763:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCollisionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCollisionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDsl.g:779:3: ( (lv_geometry_1_0= ruleGeometry ) )
            // InternalDsl.g:780:4: (lv_geometry_1_0= ruleGeometry )
            {
            // InternalDsl.g:780:4: (lv_geometry_1_0= ruleGeometry )
            // InternalDsl.g:781:5: lv_geometry_1_0= ruleGeometry
            {

            					newCompositeNode(grammarAccess.getCollisionAccess().getGeometryGeometryParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_geometry_1_0=ruleGeometry();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCollisionRule());
            					}
            					set(
            						current,
            						"geometry",
            						lv_geometry_1_0,
            						"org.xtext.urdf.Dsl.Geometry");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:798:3: ( (lv_origin_2_0= ruleOrigin ) )
            // InternalDsl.g:799:4: (lv_origin_2_0= ruleOrigin )
            {
            // InternalDsl.g:799:4: (lv_origin_2_0= ruleOrigin )
            // InternalDsl.g:800:5: lv_origin_2_0= ruleOrigin
            {

            					newCompositeNode(grammarAccess.getCollisionAccess().getOriginOriginParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_origin_2_0=ruleOrigin();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCollisionRule());
            					}
            					set(
            						current,
            						"origin",
            						lv_origin_2_0,
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
    // InternalDsl.g:821:1: entryRuleOrigin returns [EObject current=null] : iv_ruleOrigin= ruleOrigin EOF ;
    public final EObject entryRuleOrigin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrigin = null;


        try {
            // InternalDsl.g:821:47: (iv_ruleOrigin= ruleOrigin EOF )
            // InternalDsl.g:822:2: iv_ruleOrigin= ruleOrigin EOF
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
    // InternalDsl.g:828:1: ruleOrigin returns [EObject current=null] : (otherlv_0= 'Origin' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'x' ( (lv_x_3_0= ruleFLOAT ) ) )? (otherlv_4= 'y' ( (lv_y_5_0= ruleFLOAT ) ) )? (otherlv_6= 'z' ( (lv_z_7_0= ruleFLOAT ) ) )? (otherlv_8= 'roll' ( (lv_roll_9_0= ruleFLOAT ) ) )? (otherlv_10= 'pitch' ( (lv_pitch_11_0= ruleFLOAT ) ) )? (otherlv_12= 'yaw' ( (lv_yaw_13_0= ruleFLOAT ) ) )? ) ;
    public final EObject ruleOrigin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_x_3_0 = null;

        AntlrDatatypeRuleToken lv_y_5_0 = null;

        AntlrDatatypeRuleToken lv_z_7_0 = null;

        AntlrDatatypeRuleToken lv_roll_9_0 = null;

        AntlrDatatypeRuleToken lv_pitch_11_0 = null;

        AntlrDatatypeRuleToken lv_yaw_13_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:834:2: ( (otherlv_0= 'Origin' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'x' ( (lv_x_3_0= ruleFLOAT ) ) )? (otherlv_4= 'y' ( (lv_y_5_0= ruleFLOAT ) ) )? (otherlv_6= 'z' ( (lv_z_7_0= ruleFLOAT ) ) )? (otherlv_8= 'roll' ( (lv_roll_9_0= ruleFLOAT ) ) )? (otherlv_10= 'pitch' ( (lv_pitch_11_0= ruleFLOAT ) ) )? (otherlv_12= 'yaw' ( (lv_yaw_13_0= ruleFLOAT ) ) )? ) )
            // InternalDsl.g:835:2: (otherlv_0= 'Origin' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'x' ( (lv_x_3_0= ruleFLOAT ) ) )? (otherlv_4= 'y' ( (lv_y_5_0= ruleFLOAT ) ) )? (otherlv_6= 'z' ( (lv_z_7_0= ruleFLOAT ) ) )? (otherlv_8= 'roll' ( (lv_roll_9_0= ruleFLOAT ) ) )? (otherlv_10= 'pitch' ( (lv_pitch_11_0= ruleFLOAT ) ) )? (otherlv_12= 'yaw' ( (lv_yaw_13_0= ruleFLOAT ) ) )? )
            {
            // InternalDsl.g:835:2: (otherlv_0= 'Origin' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'x' ( (lv_x_3_0= ruleFLOAT ) ) )? (otherlv_4= 'y' ( (lv_y_5_0= ruleFLOAT ) ) )? (otherlv_6= 'z' ( (lv_z_7_0= ruleFLOAT ) ) )? (otherlv_8= 'roll' ( (lv_roll_9_0= ruleFLOAT ) ) )? (otherlv_10= 'pitch' ( (lv_pitch_11_0= ruleFLOAT ) ) )? (otherlv_12= 'yaw' ( (lv_yaw_13_0= ruleFLOAT ) ) )? )
            // InternalDsl.g:836:3: otherlv_0= 'Origin' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'x' ( (lv_x_3_0= ruleFLOAT ) ) )? (otherlv_4= 'y' ( (lv_y_5_0= ruleFLOAT ) ) )? (otherlv_6= 'z' ( (lv_z_7_0= ruleFLOAT ) ) )? (otherlv_8= 'roll' ( (lv_roll_9_0= ruleFLOAT ) ) )? (otherlv_10= 'pitch' ( (lv_pitch_11_0= ruleFLOAT ) ) )? (otherlv_12= 'yaw' ( (lv_yaw_13_0= ruleFLOAT ) ) )?
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOriginAccess().getOriginKeyword_0());
            		
            // InternalDsl.g:840:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:841:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:841:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:842:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

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

            // InternalDsl.g:858:3: (otherlv_2= 'x' ( (lv_x_3_0= ruleFLOAT ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==15) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDsl.g:859:4: otherlv_2= 'x' ( (lv_x_3_0= ruleFLOAT ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getOriginAccess().getXKeyword_2_0());
                    			
                    // InternalDsl.g:863:4: ( (lv_x_3_0= ruleFLOAT ) )
                    // InternalDsl.g:864:5: (lv_x_3_0= ruleFLOAT )
                    {
                    // InternalDsl.g:864:5: (lv_x_3_0= ruleFLOAT )
                    // InternalDsl.g:865:6: lv_x_3_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getOriginAccess().getXFLOATParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_x_3_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOriginRule());
                    						}
                    						set(
                    							current,
                    							"x",
                    							lv_x_3_0,
                    							"org.xtext.urdf.Dsl.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:883:3: (otherlv_4= 'y' ( (lv_y_5_0= ruleFLOAT ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==16) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDsl.g:884:4: otherlv_4= 'y' ( (lv_y_5_0= ruleFLOAT ) )
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getOriginAccess().getYKeyword_3_0());
                    			
                    // InternalDsl.g:888:4: ( (lv_y_5_0= ruleFLOAT ) )
                    // InternalDsl.g:889:5: (lv_y_5_0= ruleFLOAT )
                    {
                    // InternalDsl.g:889:5: (lv_y_5_0= ruleFLOAT )
                    // InternalDsl.g:890:6: lv_y_5_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getOriginAccess().getYFLOATParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_y_5_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOriginRule());
                    						}
                    						set(
                    							current,
                    							"y",
                    							lv_y_5_0,
                    							"org.xtext.urdf.Dsl.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:908:3: (otherlv_6= 'z' ( (lv_z_7_0= ruleFLOAT ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==17) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDsl.g:909:4: otherlv_6= 'z' ( (lv_z_7_0= ruleFLOAT ) )
                    {
                    otherlv_6=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getOriginAccess().getZKeyword_4_0());
                    			
                    // InternalDsl.g:913:4: ( (lv_z_7_0= ruleFLOAT ) )
                    // InternalDsl.g:914:5: (lv_z_7_0= ruleFLOAT )
                    {
                    // InternalDsl.g:914:5: (lv_z_7_0= ruleFLOAT )
                    // InternalDsl.g:915:6: lv_z_7_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getOriginAccess().getZFLOATParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_z_7_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOriginRule());
                    						}
                    						set(
                    							current,
                    							"z",
                    							lv_z_7_0,
                    							"org.xtext.urdf.Dsl.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:933:3: (otherlv_8= 'roll' ( (lv_roll_9_0= ruleFLOAT ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==18) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDsl.g:934:4: otherlv_8= 'roll' ( (lv_roll_9_0= ruleFLOAT ) )
                    {
                    otherlv_8=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_8, grammarAccess.getOriginAccess().getRollKeyword_5_0());
                    			
                    // InternalDsl.g:938:4: ( (lv_roll_9_0= ruleFLOAT ) )
                    // InternalDsl.g:939:5: (lv_roll_9_0= ruleFLOAT )
                    {
                    // InternalDsl.g:939:5: (lv_roll_9_0= ruleFLOAT )
                    // InternalDsl.g:940:6: lv_roll_9_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getOriginAccess().getRollFLOATParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_roll_9_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOriginRule());
                    						}
                    						set(
                    							current,
                    							"roll",
                    							lv_roll_9_0,
                    							"org.xtext.urdf.Dsl.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:958:3: (otherlv_10= 'pitch' ( (lv_pitch_11_0= ruleFLOAT ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==19) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDsl.g:959:4: otherlv_10= 'pitch' ( (lv_pitch_11_0= ruleFLOAT ) )
                    {
                    otherlv_10=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_10, grammarAccess.getOriginAccess().getPitchKeyword_6_0());
                    			
                    // InternalDsl.g:963:4: ( (lv_pitch_11_0= ruleFLOAT ) )
                    // InternalDsl.g:964:5: (lv_pitch_11_0= ruleFLOAT )
                    {
                    // InternalDsl.g:964:5: (lv_pitch_11_0= ruleFLOAT )
                    // InternalDsl.g:965:6: lv_pitch_11_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getOriginAccess().getPitchFLOATParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_pitch_11_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOriginRule());
                    						}
                    						set(
                    							current,
                    							"pitch",
                    							lv_pitch_11_0,
                    							"org.xtext.urdf.Dsl.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:983:3: (otherlv_12= 'yaw' ( (lv_yaw_13_0= ruleFLOAT ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==20) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDsl.g:984:4: otherlv_12= 'yaw' ( (lv_yaw_13_0= ruleFLOAT ) )
                    {
                    otherlv_12=(Token)match(input,20,FOLLOW_12); 

                    				newLeafNode(otherlv_12, grammarAccess.getOriginAccess().getYawKeyword_7_0());
                    			
                    // InternalDsl.g:988:4: ( (lv_yaw_13_0= ruleFLOAT ) )
                    // InternalDsl.g:989:5: (lv_yaw_13_0= ruleFLOAT )
                    {
                    // InternalDsl.g:989:5: (lv_yaw_13_0= ruleFLOAT )
                    // InternalDsl.g:990:6: lv_yaw_13_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getOriginAccess().getYawFLOATParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_yaw_13_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOriginRule());
                    						}
                    						set(
                    							current,
                    							"yaw",
                    							lv_yaw_13_0,
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
    // $ANTLR end "ruleOrigin"


    // $ANTLR start "entryRuleMass"
    // InternalDsl.g:1012:1: entryRuleMass returns [EObject current=null] : iv_ruleMass= ruleMass EOF ;
    public final EObject entryRuleMass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMass = null;


        try {
            // InternalDsl.g:1012:45: (iv_ruleMass= ruleMass EOF )
            // InternalDsl.g:1013:2: iv_ruleMass= ruleMass EOF
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
    // InternalDsl.g:1019:1: ruleMass returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Mass' otherlv_2= 'massValueInKilograms' ( (lv_massValueInKilograms_3_0= ruleFLOAT ) ) ) ;
    public final EObject ruleMass() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_massValueInKilograms_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1025:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Mass' otherlv_2= 'massValueInKilograms' ( (lv_massValueInKilograms_3_0= ruleFLOAT ) ) ) )
            // InternalDsl.g:1026:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Mass' otherlv_2= 'massValueInKilograms' ( (lv_massValueInKilograms_3_0= ruleFLOAT ) ) )
            {
            // InternalDsl.g:1026:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Mass' otherlv_2= 'massValueInKilograms' ( (lv_massValueInKilograms_3_0= ruleFLOAT ) ) )
            // InternalDsl.g:1027:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Mass' otherlv_2= 'massValueInKilograms' ( (lv_massValueInKilograms_3_0= ruleFLOAT ) )
            {
            // InternalDsl.g:1027:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDsl.g:1028:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDsl.g:1028:4: (lv_name_0_0= RULE_ID )
            // InternalDsl.g:1029:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(lv_name_0_0, grammarAccess.getMassAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getMassAccess().getMassKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getMassAccess().getMassValueInKilogramsKeyword_2());
            		
            // InternalDsl.g:1053:3: ( (lv_massValueInKilograms_3_0= ruleFLOAT ) )
            // InternalDsl.g:1054:4: (lv_massValueInKilograms_3_0= ruleFLOAT )
            {
            // InternalDsl.g:1054:4: (lv_massValueInKilograms_3_0= ruleFLOAT )
            // InternalDsl.g:1055:5: lv_massValueInKilograms_3_0= ruleFLOAT
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
    // InternalDsl.g:1076:1: entryRuleInertia returns [EObject current=null] : iv_ruleInertia= ruleInertia EOF ;
    public final EObject entryRuleInertia() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInertia = null;


        try {
            // InternalDsl.g:1076:48: (iv_ruleInertia= ruleInertia EOF )
            // InternalDsl.g:1077:2: iv_ruleInertia= ruleInertia EOF
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
    // InternalDsl.g:1083:1: ruleInertia returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Inertia' otherlv_2= 'ixx' ( (lv_ixx_3_0= ruleFLOAT ) ) otherlv_4= 'ixy' ( (lv_ixy_5_0= ruleFLOAT ) ) otherlv_6= 'ixz' ( (lv_ixz_7_0= ruleFLOAT ) ) otherlv_8= 'iyy' ( (lv_iyy_9_0= ruleFLOAT ) ) otherlv_10= 'iyz' ( (lv_iyz_11_0= ruleFLOAT ) ) otherlv_12= 'izz' ( (lv_izz_13_0= ruleFLOAT ) ) ) ;
    public final EObject ruleInertia() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
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
            // InternalDsl.g:1089:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Inertia' otherlv_2= 'ixx' ( (lv_ixx_3_0= ruleFLOAT ) ) otherlv_4= 'ixy' ( (lv_ixy_5_0= ruleFLOAT ) ) otherlv_6= 'ixz' ( (lv_ixz_7_0= ruleFLOAT ) ) otherlv_8= 'iyy' ( (lv_iyy_9_0= ruleFLOAT ) ) otherlv_10= 'iyz' ( (lv_iyz_11_0= ruleFLOAT ) ) otherlv_12= 'izz' ( (lv_izz_13_0= ruleFLOAT ) ) ) )
            // InternalDsl.g:1090:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Inertia' otherlv_2= 'ixx' ( (lv_ixx_3_0= ruleFLOAT ) ) otherlv_4= 'ixy' ( (lv_ixy_5_0= ruleFLOAT ) ) otherlv_6= 'ixz' ( (lv_ixz_7_0= ruleFLOAT ) ) otherlv_8= 'iyy' ( (lv_iyy_9_0= ruleFLOAT ) ) otherlv_10= 'iyz' ( (lv_iyz_11_0= ruleFLOAT ) ) otherlv_12= 'izz' ( (lv_izz_13_0= ruleFLOAT ) ) )
            {
            // InternalDsl.g:1090:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Inertia' otherlv_2= 'ixx' ( (lv_ixx_3_0= ruleFLOAT ) ) otherlv_4= 'ixy' ( (lv_ixy_5_0= ruleFLOAT ) ) otherlv_6= 'ixz' ( (lv_ixz_7_0= ruleFLOAT ) ) otherlv_8= 'iyy' ( (lv_iyy_9_0= ruleFLOAT ) ) otherlv_10= 'iyz' ( (lv_iyz_11_0= ruleFLOAT ) ) otherlv_12= 'izz' ( (lv_izz_13_0= ruleFLOAT ) ) )
            // InternalDsl.g:1091:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Inertia' otherlv_2= 'ixx' ( (lv_ixx_3_0= ruleFLOAT ) ) otherlv_4= 'ixy' ( (lv_ixy_5_0= ruleFLOAT ) ) otherlv_6= 'ixz' ( (lv_ixz_7_0= ruleFLOAT ) ) otherlv_8= 'iyy' ( (lv_iyy_9_0= ruleFLOAT ) ) otherlv_10= 'iyz' ( (lv_iyz_11_0= ruleFLOAT ) ) otherlv_12= 'izz' ( (lv_izz_13_0= ruleFLOAT ) )
            {
            // InternalDsl.g:1091:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDsl.g:1092:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDsl.g:1092:4: (lv_name_0_0= RULE_ID )
            // InternalDsl.g:1093:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_name_0_0, grammarAccess.getInertiaAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInertiaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getInertiaAccess().getInertiaKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getInertiaAccess().getIxxKeyword_2());
            		
            // InternalDsl.g:1117:3: ( (lv_ixx_3_0= ruleFLOAT ) )
            // InternalDsl.g:1118:4: (lv_ixx_3_0= ruleFLOAT )
            {
            // InternalDsl.g:1118:4: (lv_ixx_3_0= ruleFLOAT )
            // InternalDsl.g:1119:5: lv_ixx_3_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getInertiaAccess().getIxxFLOATParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
            lv_ixx_3_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInertiaRule());
            					}
            					set(
            						current,
            						"ixx",
            						lv_ixx_3_0,
            						"org.xtext.urdf.Dsl.FLOAT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getInertiaAccess().getIxyKeyword_4());
            		
            // InternalDsl.g:1140:3: ( (lv_ixy_5_0= ruleFLOAT ) )
            // InternalDsl.g:1141:4: (lv_ixy_5_0= ruleFLOAT )
            {
            // InternalDsl.g:1141:4: (lv_ixy_5_0= ruleFLOAT )
            // InternalDsl.g:1142:5: lv_ixy_5_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getInertiaAccess().getIxyFLOATParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_23);
            lv_ixy_5_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInertiaRule());
            					}
            					set(
            						current,
            						"ixy",
            						lv_ixy_5_0,
            						"org.xtext.urdf.Dsl.FLOAT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,26,FOLLOW_12); 

            			newLeafNode(otherlv_6, grammarAccess.getInertiaAccess().getIxzKeyword_6());
            		
            // InternalDsl.g:1163:3: ( (lv_ixz_7_0= ruleFLOAT ) )
            // InternalDsl.g:1164:4: (lv_ixz_7_0= ruleFLOAT )
            {
            // InternalDsl.g:1164:4: (lv_ixz_7_0= ruleFLOAT )
            // InternalDsl.g:1165:5: lv_ixz_7_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getInertiaAccess().getIxzFLOATParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_24);
            lv_ixz_7_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInertiaRule());
            					}
            					set(
            						current,
            						"ixz",
            						lv_ixz_7_0,
            						"org.xtext.urdf.Dsl.FLOAT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,27,FOLLOW_12); 

            			newLeafNode(otherlv_8, grammarAccess.getInertiaAccess().getIyyKeyword_8());
            		
            // InternalDsl.g:1186:3: ( (lv_iyy_9_0= ruleFLOAT ) )
            // InternalDsl.g:1187:4: (lv_iyy_9_0= ruleFLOAT )
            {
            // InternalDsl.g:1187:4: (lv_iyy_9_0= ruleFLOAT )
            // InternalDsl.g:1188:5: lv_iyy_9_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getInertiaAccess().getIyyFLOATParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_25);
            lv_iyy_9_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInertiaRule());
            					}
            					set(
            						current,
            						"iyy",
            						lv_iyy_9_0,
            						"org.xtext.urdf.Dsl.FLOAT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,28,FOLLOW_12); 

            			newLeafNode(otherlv_10, grammarAccess.getInertiaAccess().getIyzKeyword_10());
            		
            // InternalDsl.g:1209:3: ( (lv_iyz_11_0= ruleFLOAT ) )
            // InternalDsl.g:1210:4: (lv_iyz_11_0= ruleFLOAT )
            {
            // InternalDsl.g:1210:4: (lv_iyz_11_0= ruleFLOAT )
            // InternalDsl.g:1211:5: lv_iyz_11_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getInertiaAccess().getIyzFLOATParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_26);
            lv_iyz_11_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInertiaRule());
            					}
            					set(
            						current,
            						"iyz",
            						lv_iyz_11_0,
            						"org.xtext.urdf.Dsl.FLOAT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,29,FOLLOW_12); 

            			newLeafNode(otherlv_12, grammarAccess.getInertiaAccess().getIzzKeyword_12());
            		
            // InternalDsl.g:1232:3: ( (lv_izz_13_0= ruleFLOAT ) )
            // InternalDsl.g:1233:4: (lv_izz_13_0= ruleFLOAT )
            {
            // InternalDsl.g:1233:4: (lv_izz_13_0= ruleFLOAT )
            // InternalDsl.g:1234:5: lv_izz_13_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getInertiaAccess().getIzzFLOATParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_2);
            lv_izz_13_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInertiaRule());
            					}
            					set(
            						current,
            						"izz",
            						lv_izz_13_0,
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
    // $ANTLR end "ruleInertia"


    // $ANTLR start "entryRuleColor"
    // InternalDsl.g:1255:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // InternalDsl.g:1255:46: (iv_ruleColor= ruleColor EOF )
            // InternalDsl.g:1256:2: iv_ruleColor= ruleColor EOF
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
    // InternalDsl.g:1262:1: ruleColor returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Color' (otherlv_2= 'red' ( (lv_red_3_0= ruleFLOAT ) ) )? (otherlv_4= 'green' ( (lv_green_5_0= ruleFLOAT ) ) )? (otherlv_6= 'blue' ( (lv_blue_7_0= ruleFLOAT ) ) )? (otherlv_8= 'alpha' ( (lv_alpha_9_0= ruleFLOAT ) ) )? ) ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_red_3_0 = null;

        AntlrDatatypeRuleToken lv_green_5_0 = null;

        AntlrDatatypeRuleToken lv_blue_7_0 = null;

        AntlrDatatypeRuleToken lv_alpha_9_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1268:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Color' (otherlv_2= 'red' ( (lv_red_3_0= ruleFLOAT ) ) )? (otherlv_4= 'green' ( (lv_green_5_0= ruleFLOAT ) ) )? (otherlv_6= 'blue' ( (lv_blue_7_0= ruleFLOAT ) ) )? (otherlv_8= 'alpha' ( (lv_alpha_9_0= ruleFLOAT ) ) )? ) )
            // InternalDsl.g:1269:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Color' (otherlv_2= 'red' ( (lv_red_3_0= ruleFLOAT ) ) )? (otherlv_4= 'green' ( (lv_green_5_0= ruleFLOAT ) ) )? (otherlv_6= 'blue' ( (lv_blue_7_0= ruleFLOAT ) ) )? (otherlv_8= 'alpha' ( (lv_alpha_9_0= ruleFLOAT ) ) )? )
            {
            // InternalDsl.g:1269:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Color' (otherlv_2= 'red' ( (lv_red_3_0= ruleFLOAT ) ) )? (otherlv_4= 'green' ( (lv_green_5_0= ruleFLOAT ) ) )? (otherlv_6= 'blue' ( (lv_blue_7_0= ruleFLOAT ) ) )? (otherlv_8= 'alpha' ( (lv_alpha_9_0= ruleFLOAT ) ) )? )
            // InternalDsl.g:1270:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Color' (otherlv_2= 'red' ( (lv_red_3_0= ruleFLOAT ) ) )? (otherlv_4= 'green' ( (lv_green_5_0= ruleFLOAT ) ) )? (otherlv_6= 'blue' ( (lv_blue_7_0= ruleFLOAT ) ) )? (otherlv_8= 'alpha' ( (lv_alpha_9_0= ruleFLOAT ) ) )?
            {
            // InternalDsl.g:1270:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDsl.g:1271:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDsl.g:1271:4: (lv_name_0_0= RULE_ID )
            // InternalDsl.g:1272:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(lv_name_0_0, grammarAccess.getColorAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getColorAccess().getColorKeyword_1());
            		
            // InternalDsl.g:1292:3: (otherlv_2= 'red' ( (lv_red_3_0= ruleFLOAT ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDsl.g:1293:4: otherlv_2= 'red' ( (lv_red_3_0= ruleFLOAT ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getColorAccess().getRedKeyword_2_0());
                    			
                    // InternalDsl.g:1297:4: ( (lv_red_3_0= ruleFLOAT ) )
                    // InternalDsl.g:1298:5: (lv_red_3_0= ruleFLOAT )
                    {
                    // InternalDsl.g:1298:5: (lv_red_3_0= ruleFLOAT )
                    // InternalDsl.g:1299:6: lv_red_3_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getColorAccess().getRedFLOATParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_29);
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


                    }
                    break;

            }

            // InternalDsl.g:1317:3: (otherlv_4= 'green' ( (lv_green_5_0= ruleFLOAT ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==32) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDsl.g:1318:4: otherlv_4= 'green' ( (lv_green_5_0= ruleFLOAT ) )
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getColorAccess().getGreenKeyword_3_0());
                    			
                    // InternalDsl.g:1322:4: ( (lv_green_5_0= ruleFLOAT ) )
                    // InternalDsl.g:1323:5: (lv_green_5_0= ruleFLOAT )
                    {
                    // InternalDsl.g:1323:5: (lv_green_5_0= ruleFLOAT )
                    // InternalDsl.g:1324:6: lv_green_5_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getColorAccess().getGreenFLOATParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_green_5_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColorRule());
                    						}
                    						set(
                    							current,
                    							"green",
                    							lv_green_5_0,
                    							"org.xtext.urdf.Dsl.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1342:3: (otherlv_6= 'blue' ( (lv_blue_7_0= ruleFLOAT ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==33) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDsl.g:1343:4: otherlv_6= 'blue' ( (lv_blue_7_0= ruleFLOAT ) )
                    {
                    otherlv_6=(Token)match(input,33,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getColorAccess().getBlueKeyword_4_0());
                    			
                    // InternalDsl.g:1347:4: ( (lv_blue_7_0= ruleFLOAT ) )
                    // InternalDsl.g:1348:5: (lv_blue_7_0= ruleFLOAT )
                    {
                    // InternalDsl.g:1348:5: (lv_blue_7_0= ruleFLOAT )
                    // InternalDsl.g:1349:6: lv_blue_7_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getColorAccess().getBlueFLOATParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_blue_7_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColorRule());
                    						}
                    						set(
                    							current,
                    							"blue",
                    							lv_blue_7_0,
                    							"org.xtext.urdf.Dsl.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1367:3: (otherlv_8= 'alpha' ( (lv_alpha_9_0= ruleFLOAT ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==34) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDsl.g:1368:4: otherlv_8= 'alpha' ( (lv_alpha_9_0= ruleFLOAT ) )
                    {
                    otherlv_8=(Token)match(input,34,FOLLOW_12); 

                    				newLeafNode(otherlv_8, grammarAccess.getColorAccess().getAlphaKeyword_5_0());
                    			
                    // InternalDsl.g:1372:4: ( (lv_alpha_9_0= ruleFLOAT ) )
                    // InternalDsl.g:1373:5: (lv_alpha_9_0= ruleFLOAT )
                    {
                    // InternalDsl.g:1373:5: (lv_alpha_9_0= ruleFLOAT )
                    // InternalDsl.g:1374:6: lv_alpha_9_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getColorAccess().getAlphaFLOATParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_alpha_9_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColorRule());
                    						}
                    						set(
                    							current,
                    							"alpha",
                    							lv_alpha_9_0,
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
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleTexture"
    // InternalDsl.g:1396:1: entryRuleTexture returns [EObject current=null] : iv_ruleTexture= ruleTexture EOF ;
    public final EObject entryRuleTexture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTexture = null;


        try {
            // InternalDsl.g:1396:48: (iv_ruleTexture= ruleTexture EOF )
            // InternalDsl.g:1397:2: iv_ruleTexture= ruleTexture EOF
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
    // InternalDsl.g:1403:1: ruleTexture returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Texture' (otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleTexture() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_pathToFile_3_0=null;


        	enterRule();

        try {
            // InternalDsl.g:1409:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Texture' (otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= RULE_STRING ) ) )? ) )
            // InternalDsl.g:1410:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Texture' (otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= RULE_STRING ) ) )? )
            {
            // InternalDsl.g:1410:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Texture' (otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= RULE_STRING ) ) )? )
            // InternalDsl.g:1411:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Texture' (otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= RULE_STRING ) ) )?
            {
            // InternalDsl.g:1411:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDsl.g:1412:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDsl.g:1412:4: (lv_name_0_0= RULE_ID )
            // InternalDsl.g:1413:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_32); 

            					newLeafNode(lv_name_0_0, grammarAccess.getTextureAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getTextureAccess().getTextureKeyword_1());
            		
            // InternalDsl.g:1433:3: (otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= RULE_STRING ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==36) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDsl.g:1434:4: otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,36,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getTextureAccess().getPathToFileKeyword_2_0());
                    			
                    // InternalDsl.g:1438:4: ( (lv_pathToFile_3_0= RULE_STRING ) )
                    // InternalDsl.g:1439:5: (lv_pathToFile_3_0= RULE_STRING )
                    {
                    // InternalDsl.g:1439:5: (lv_pathToFile_3_0= RULE_STRING )
                    // InternalDsl.g:1440:6: lv_pathToFile_3_0= RULE_STRING
                    {
                    lv_pathToFile_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_pathToFile_3_0, grammarAccess.getTextureAccess().getPathToFileSTRINGTerminalRuleCall_2_1_0());
                    					

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
    // $ANTLR end "ruleTexture"


    // $ANTLR start "entryRuleBox"
    // InternalDsl.g:1461:1: entryRuleBox returns [EObject current=null] : iv_ruleBox= ruleBox EOF ;
    public final EObject entryRuleBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBox = null;


        try {
            // InternalDsl.g:1461:44: (iv_ruleBox= ruleBox EOF )
            // InternalDsl.g:1462:2: iv_ruleBox= ruleBox EOF
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
    // InternalDsl.g:1468:1: ruleBox returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Box' (otherlv_2= 'height' ( (lv_height_3_0= ruleFLOAT ) ) )? (otherlv_4= 'length' ( (lv_length_5_0= ruleFLOAT ) ) )? (otherlv_6= 'width' ( (lv_width_7_0= ruleFLOAT ) ) )? ) ;
    public final EObject ruleBox() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_height_3_0 = null;

        AntlrDatatypeRuleToken lv_length_5_0 = null;

        AntlrDatatypeRuleToken lv_width_7_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1474:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Box' (otherlv_2= 'height' ( (lv_height_3_0= ruleFLOAT ) ) )? (otherlv_4= 'length' ( (lv_length_5_0= ruleFLOAT ) ) )? (otherlv_6= 'width' ( (lv_width_7_0= ruleFLOAT ) ) )? ) )
            // InternalDsl.g:1475:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Box' (otherlv_2= 'height' ( (lv_height_3_0= ruleFLOAT ) ) )? (otherlv_4= 'length' ( (lv_length_5_0= ruleFLOAT ) ) )? (otherlv_6= 'width' ( (lv_width_7_0= ruleFLOAT ) ) )? )
            {
            // InternalDsl.g:1475:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Box' (otherlv_2= 'height' ( (lv_height_3_0= ruleFLOAT ) ) )? (otherlv_4= 'length' ( (lv_length_5_0= ruleFLOAT ) ) )? (otherlv_6= 'width' ( (lv_width_7_0= ruleFLOAT ) ) )? )
            // InternalDsl.g:1476:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Box' (otherlv_2= 'height' ( (lv_height_3_0= ruleFLOAT ) ) )? (otherlv_4= 'length' ( (lv_length_5_0= ruleFLOAT ) ) )? (otherlv_6= 'width' ( (lv_width_7_0= ruleFLOAT ) ) )?
            {
            // InternalDsl.g:1476:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDsl.g:1477:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDsl.g:1477:4: (lv_name_0_0= RULE_ID )
            // InternalDsl.g:1478:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_34); 

            					newLeafNode(lv_name_0_0, grammarAccess.getBoxAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBoxRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,37,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getBoxAccess().getBoxKeyword_1());
            		
            // InternalDsl.g:1498:3: (otherlv_2= 'height' ( (lv_height_3_0= ruleFLOAT ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==38) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalDsl.g:1499:4: otherlv_2= 'height' ( (lv_height_3_0= ruleFLOAT ) )
                    {
                    otherlv_2=(Token)match(input,38,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getBoxAccess().getHeightKeyword_2_0());
                    			
                    // InternalDsl.g:1503:4: ( (lv_height_3_0= ruleFLOAT ) )
                    // InternalDsl.g:1504:5: (lv_height_3_0= ruleFLOAT )
                    {
                    // InternalDsl.g:1504:5: (lv_height_3_0= ruleFLOAT )
                    // InternalDsl.g:1505:6: lv_height_3_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getBoxAccess().getHeightFLOATParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_height_3_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBoxRule());
                    						}
                    						set(
                    							current,
                    							"height",
                    							lv_height_3_0,
                    							"org.xtext.urdf.Dsl.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1523:3: (otherlv_4= 'length' ( (lv_length_5_0= ruleFLOAT ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==39) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalDsl.g:1524:4: otherlv_4= 'length' ( (lv_length_5_0= ruleFLOAT ) )
                    {
                    otherlv_4=(Token)match(input,39,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getBoxAccess().getLengthKeyword_3_0());
                    			
                    // InternalDsl.g:1528:4: ( (lv_length_5_0= ruleFLOAT ) )
                    // InternalDsl.g:1529:5: (lv_length_5_0= ruleFLOAT )
                    {
                    // InternalDsl.g:1529:5: (lv_length_5_0= ruleFLOAT )
                    // InternalDsl.g:1530:6: lv_length_5_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getBoxAccess().getLengthFLOATParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_length_5_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBoxRule());
                    						}
                    						set(
                    							current,
                    							"length",
                    							lv_length_5_0,
                    							"org.xtext.urdf.Dsl.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1548:3: (otherlv_6= 'width' ( (lv_width_7_0= ruleFLOAT ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==40) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalDsl.g:1549:4: otherlv_6= 'width' ( (lv_width_7_0= ruleFLOAT ) )
                    {
                    otherlv_6=(Token)match(input,40,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getBoxAccess().getWidthKeyword_4_0());
                    			
                    // InternalDsl.g:1553:4: ( (lv_width_7_0= ruleFLOAT ) )
                    // InternalDsl.g:1554:5: (lv_width_7_0= ruleFLOAT )
                    {
                    // InternalDsl.g:1554:5: (lv_width_7_0= ruleFLOAT )
                    // InternalDsl.g:1555:6: lv_width_7_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getBoxAccess().getWidthFLOATParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_width_7_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBoxRule());
                    						}
                    						set(
                    							current,
                    							"width",
                    							lv_width_7_0,
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
    // $ANTLR end "ruleBox"


    // $ANTLR start "entryRuleCylinder"
    // InternalDsl.g:1577:1: entryRuleCylinder returns [EObject current=null] : iv_ruleCylinder= ruleCylinder EOF ;
    public final EObject entryRuleCylinder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCylinder = null;


        try {
            // InternalDsl.g:1577:49: (iv_ruleCylinder= ruleCylinder EOF )
            // InternalDsl.g:1578:2: iv_ruleCylinder= ruleCylinder EOF
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
    // InternalDsl.g:1584:1: ruleCylinder returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Cylinder' (otherlv_2= 'radius' ( (lv_radius_3_0= ruleFLOAT ) ) )? (otherlv_4= 'length' ( (lv_length_5_0= ruleFLOAT ) ) )? ) ;
    public final EObject ruleCylinder() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_radius_3_0 = null;

        AntlrDatatypeRuleToken lv_length_5_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1590:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Cylinder' (otherlv_2= 'radius' ( (lv_radius_3_0= ruleFLOAT ) ) )? (otherlv_4= 'length' ( (lv_length_5_0= ruleFLOAT ) ) )? ) )
            // InternalDsl.g:1591:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Cylinder' (otherlv_2= 'radius' ( (lv_radius_3_0= ruleFLOAT ) ) )? (otherlv_4= 'length' ( (lv_length_5_0= ruleFLOAT ) ) )? )
            {
            // InternalDsl.g:1591:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Cylinder' (otherlv_2= 'radius' ( (lv_radius_3_0= ruleFLOAT ) ) )? (otherlv_4= 'length' ( (lv_length_5_0= ruleFLOAT ) ) )? )
            // InternalDsl.g:1592:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Cylinder' (otherlv_2= 'radius' ( (lv_radius_3_0= ruleFLOAT ) ) )? (otherlv_4= 'length' ( (lv_length_5_0= ruleFLOAT ) ) )?
            {
            // InternalDsl.g:1592:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDsl.g:1593:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDsl.g:1593:4: (lv_name_0_0= RULE_ID )
            // InternalDsl.g:1594:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_38); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCylinderAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCylinderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,41,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getCylinderAccess().getCylinderKeyword_1());
            		
            // InternalDsl.g:1614:3: (otherlv_2= 'radius' ( (lv_radius_3_0= ruleFLOAT ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==42) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalDsl.g:1615:4: otherlv_2= 'radius' ( (lv_radius_3_0= ruleFLOAT ) )
                    {
                    otherlv_2=(Token)match(input,42,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getCylinderAccess().getRadiusKeyword_2_0());
                    			
                    // InternalDsl.g:1619:4: ( (lv_radius_3_0= ruleFLOAT ) )
                    // InternalDsl.g:1620:5: (lv_radius_3_0= ruleFLOAT )
                    {
                    // InternalDsl.g:1620:5: (lv_radius_3_0= ruleFLOAT )
                    // InternalDsl.g:1621:6: lv_radius_3_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getCylinderAccess().getRadiusFLOATParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_radius_3_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCylinderRule());
                    						}
                    						set(
                    							current,
                    							"radius",
                    							lv_radius_3_0,
                    							"org.xtext.urdf.Dsl.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1639:3: (otherlv_4= 'length' ( (lv_length_5_0= ruleFLOAT ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==39) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalDsl.g:1640:4: otherlv_4= 'length' ( (lv_length_5_0= ruleFLOAT ) )
                    {
                    otherlv_4=(Token)match(input,39,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getCylinderAccess().getLengthKeyword_3_0());
                    			
                    // InternalDsl.g:1644:4: ( (lv_length_5_0= ruleFLOAT ) )
                    // InternalDsl.g:1645:5: (lv_length_5_0= ruleFLOAT )
                    {
                    // InternalDsl.g:1645:5: (lv_length_5_0= ruleFLOAT )
                    // InternalDsl.g:1646:6: lv_length_5_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getCylinderAccess().getLengthFLOATParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_length_5_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCylinderRule());
                    						}
                    						set(
                    							current,
                    							"length",
                    							lv_length_5_0,
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
    // $ANTLR end "ruleCylinder"


    // $ANTLR start "entryRuleMesh"
    // InternalDsl.g:1668:1: entryRuleMesh returns [EObject current=null] : iv_ruleMesh= ruleMesh EOF ;
    public final EObject entryRuleMesh() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMesh = null;


        try {
            // InternalDsl.g:1668:45: (iv_ruleMesh= ruleMesh EOF )
            // InternalDsl.g:1669:2: iv_ruleMesh= ruleMesh EOF
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
    // InternalDsl.g:1675:1: ruleMesh returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Mesh' (otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= RULE_STRING ) ) )? (otherlv_4= 'box' ( (otherlv_5= RULE_STRING ) ) )? ) ;
    public final EObject ruleMesh() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_pathToFile_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalDsl.g:1681:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Mesh' (otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= RULE_STRING ) ) )? (otherlv_4= 'box' ( (otherlv_5= RULE_STRING ) ) )? ) )
            // InternalDsl.g:1682:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Mesh' (otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= RULE_STRING ) ) )? (otherlv_4= 'box' ( (otherlv_5= RULE_STRING ) ) )? )
            {
            // InternalDsl.g:1682:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Mesh' (otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= RULE_STRING ) ) )? (otherlv_4= 'box' ( (otherlv_5= RULE_STRING ) ) )? )
            // InternalDsl.g:1683:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Mesh' (otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= RULE_STRING ) ) )? (otherlv_4= 'box' ( (otherlv_5= RULE_STRING ) ) )?
            {
            // InternalDsl.g:1683:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDsl.g:1684:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDsl.g:1684:4: (lv_name_0_0= RULE_ID )
            // InternalDsl.g:1685:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_41); 

            					newLeafNode(lv_name_0_0, grammarAccess.getMeshAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMeshRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,43,FOLLOW_42); 

            			newLeafNode(otherlv_1, grammarAccess.getMeshAccess().getMeshKeyword_1());
            		
            // InternalDsl.g:1705:3: (otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= RULE_STRING ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==36) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalDsl.g:1706:4: otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,36,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getMeshAccess().getPathToFileKeyword_2_0());
                    			
                    // InternalDsl.g:1710:4: ( (lv_pathToFile_3_0= RULE_STRING ) )
                    // InternalDsl.g:1711:5: (lv_pathToFile_3_0= RULE_STRING )
                    {
                    // InternalDsl.g:1711:5: (lv_pathToFile_3_0= RULE_STRING )
                    // InternalDsl.g:1712:6: lv_pathToFile_3_0= RULE_STRING
                    {
                    lv_pathToFile_3_0=(Token)match(input,RULE_STRING,FOLLOW_43); 

                    						newLeafNode(lv_pathToFile_3_0, grammarAccess.getMeshAccess().getPathToFileSTRINGTerminalRuleCall_2_1_0());
                    					

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


                    }
                    break;

            }

            // InternalDsl.g:1729:3: (otherlv_4= 'box' ( (otherlv_5= RULE_STRING ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==44) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalDsl.g:1730:4: otherlv_4= 'box' ( (otherlv_5= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,44,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getMeshAccess().getBoxKeyword_3_0());
                    			
                    // InternalDsl.g:1734:4: ( (otherlv_5= RULE_STRING ) )
                    // InternalDsl.g:1735:5: (otherlv_5= RULE_STRING )
                    {
                    // InternalDsl.g:1735:5: (otherlv_5= RULE_STRING )
                    // InternalDsl.g:1736:6: otherlv_5= RULE_STRING
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMeshRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(otherlv_5, grammarAccess.getMeshAccess().getBoxBoxCrossReference_3_1_0());
                    					

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
    // InternalDsl.g:1752:1: entryRuleSphere returns [EObject current=null] : iv_ruleSphere= ruleSphere EOF ;
    public final EObject entryRuleSphere() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSphere = null;


        try {
            // InternalDsl.g:1752:47: (iv_ruleSphere= ruleSphere EOF )
            // InternalDsl.g:1753:2: iv_ruleSphere= ruleSphere EOF
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
    // InternalDsl.g:1759:1: ruleSphere returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Sphere' (otherlv_2= 'radius' ( (lv_radius_3_0= ruleFLOAT ) ) )? ) ;
    public final EObject ruleSphere() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_radius_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1765:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Sphere' (otherlv_2= 'radius' ( (lv_radius_3_0= ruleFLOAT ) ) )? ) )
            // InternalDsl.g:1766:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Sphere' (otherlv_2= 'radius' ( (lv_radius_3_0= ruleFLOAT ) ) )? )
            {
            // InternalDsl.g:1766:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Sphere' (otherlv_2= 'radius' ( (lv_radius_3_0= ruleFLOAT ) ) )? )
            // InternalDsl.g:1767:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Sphere' (otherlv_2= 'radius' ( (lv_radius_3_0= ruleFLOAT ) ) )?
            {
            // InternalDsl.g:1767:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDsl.g:1768:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDsl.g:1768:4: (lv_name_0_0= RULE_ID )
            // InternalDsl.g:1769:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_44); 

            					newLeafNode(lv_name_0_0, grammarAccess.getSphereAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSphereRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,45,FOLLOW_45); 

            			newLeafNode(otherlv_1, grammarAccess.getSphereAccess().getSphereKeyword_1());
            		
            // InternalDsl.g:1789:3: (otherlv_2= 'radius' ( (lv_radius_3_0= ruleFLOAT ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==42) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalDsl.g:1790:4: otherlv_2= 'radius' ( (lv_radius_3_0= ruleFLOAT ) )
                    {
                    otherlv_2=(Token)match(input,42,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getSphereAccess().getRadiusKeyword_2_0());
                    			
                    // InternalDsl.g:1794:4: ( (lv_radius_3_0= ruleFLOAT ) )
                    // InternalDsl.g:1795:5: (lv_radius_3_0= ruleFLOAT )
                    {
                    // InternalDsl.g:1795:5: (lv_radius_3_0= ruleFLOAT )
                    // InternalDsl.g:1796:6: lv_radius_3_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getSphereAccess().getRadiusFLOATParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_radius_3_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSphereRule());
                    						}
                    						set(
                    							current,
                    							"radius",
                    							lv_radius_3_0,
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
    // InternalDsl.g:1825:1: ruleLimit returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Limit' otherlv_2= 'lower' ( (lv_lower_3_0= ruleFLOAT ) ) otherlv_4= 'upper' ( (lv_upper_5_0= ruleFLOAT ) ) otherlv_6= 'effort' ( (lv_effort_7_0= ruleFLOAT ) ) otherlv_8= 'velocity' ( (lv_velocity_9_0= ruleFLOAT ) ) ) ;
    public final EObject ruleLimit() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_lower_3_0 = null;

        AntlrDatatypeRuleToken lv_upper_5_0 = null;

        AntlrDatatypeRuleToken lv_effort_7_0 = null;

        AntlrDatatypeRuleToken lv_velocity_9_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1831:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Limit' otherlv_2= 'lower' ( (lv_lower_3_0= ruleFLOAT ) ) otherlv_4= 'upper' ( (lv_upper_5_0= ruleFLOAT ) ) otherlv_6= 'effort' ( (lv_effort_7_0= ruleFLOAT ) ) otherlv_8= 'velocity' ( (lv_velocity_9_0= ruleFLOAT ) ) ) )
            // InternalDsl.g:1832:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Limit' otherlv_2= 'lower' ( (lv_lower_3_0= ruleFLOAT ) ) otherlv_4= 'upper' ( (lv_upper_5_0= ruleFLOAT ) ) otherlv_6= 'effort' ( (lv_effort_7_0= ruleFLOAT ) ) otherlv_8= 'velocity' ( (lv_velocity_9_0= ruleFLOAT ) ) )
            {
            // InternalDsl.g:1832:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Limit' otherlv_2= 'lower' ( (lv_lower_3_0= ruleFLOAT ) ) otherlv_4= 'upper' ( (lv_upper_5_0= ruleFLOAT ) ) otherlv_6= 'effort' ( (lv_effort_7_0= ruleFLOAT ) ) otherlv_8= 'velocity' ( (lv_velocity_9_0= ruleFLOAT ) ) )
            // InternalDsl.g:1833:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Limit' otherlv_2= 'lower' ( (lv_lower_3_0= ruleFLOAT ) ) otherlv_4= 'upper' ( (lv_upper_5_0= ruleFLOAT ) ) otherlv_6= 'effort' ( (lv_effort_7_0= ruleFLOAT ) ) otherlv_8= 'velocity' ( (lv_velocity_9_0= ruleFLOAT ) )
            {
            // InternalDsl.g:1833:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDsl.g:1834:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDsl.g:1834:4: (lv_name_0_0= RULE_ID )
            // InternalDsl.g:1835:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_46); 

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

            otherlv_1=(Token)match(input,46,FOLLOW_47); 

            			newLeafNode(otherlv_1, grammarAccess.getLimitAccess().getLimitKeyword_1());
            		
            otherlv_2=(Token)match(input,47,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getLimitAccess().getLowerKeyword_2());
            		
            // InternalDsl.g:1859:3: ( (lv_lower_3_0= ruleFLOAT ) )
            // InternalDsl.g:1860:4: (lv_lower_3_0= ruleFLOAT )
            {
            // InternalDsl.g:1860:4: (lv_lower_3_0= ruleFLOAT )
            // InternalDsl.g:1861:5: lv_lower_3_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getLimitAccess().getLowerFLOATParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_48);
            lv_lower_3_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLimitRule());
            					}
            					set(
            						current,
            						"lower",
            						lv_lower_3_0,
            						"org.xtext.urdf.Dsl.FLOAT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,48,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getLimitAccess().getUpperKeyword_4());
            		
            // InternalDsl.g:1882:3: ( (lv_upper_5_0= ruleFLOAT ) )
            // InternalDsl.g:1883:4: (lv_upper_5_0= ruleFLOAT )
            {
            // InternalDsl.g:1883:4: (lv_upper_5_0= ruleFLOAT )
            // InternalDsl.g:1884:5: lv_upper_5_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getLimitAccess().getUpperFLOATParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_49);
            lv_upper_5_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLimitRule());
            					}
            					set(
            						current,
            						"upper",
            						lv_upper_5_0,
            						"org.xtext.urdf.Dsl.FLOAT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,49,FOLLOW_12); 

            			newLeafNode(otherlv_6, grammarAccess.getLimitAccess().getEffortKeyword_6());
            		
            // InternalDsl.g:1905:3: ( (lv_effort_7_0= ruleFLOAT ) )
            // InternalDsl.g:1906:4: (lv_effort_7_0= ruleFLOAT )
            {
            // InternalDsl.g:1906:4: (lv_effort_7_0= ruleFLOAT )
            // InternalDsl.g:1907:5: lv_effort_7_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getLimitAccess().getEffortFLOATParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_50);
            lv_effort_7_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLimitRule());
            					}
            					set(
            						current,
            						"effort",
            						lv_effort_7_0,
            						"org.xtext.urdf.Dsl.FLOAT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,50,FOLLOW_12); 

            			newLeafNode(otherlv_8, grammarAccess.getLimitAccess().getVelocityKeyword_8());
            		
            // InternalDsl.g:1928:3: ( (lv_velocity_9_0= ruleFLOAT ) )
            // InternalDsl.g:1929:4: (lv_velocity_9_0= ruleFLOAT )
            {
            // InternalDsl.g:1929:4: (lv_velocity_9_0= ruleFLOAT )
            // InternalDsl.g:1930:5: lv_velocity_9_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getLimitAccess().getVelocityFLOATParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_2);
            lv_velocity_9_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLimitRule());
            					}
            					set(
            						current,
            						"velocity",
            						lv_velocity_9_0,
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
    // $ANTLR end "ruleLimit"


    // $ANTLR start "entryRuleAxis"
    // InternalDsl.g:1951:1: entryRuleAxis returns [EObject current=null] : iv_ruleAxis= ruleAxis EOF ;
    public final EObject entryRuleAxis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAxis = null;


        try {
            // InternalDsl.g:1951:45: (iv_ruleAxis= ruleAxis EOF )
            // InternalDsl.g:1952:2: iv_ruleAxis= ruleAxis EOF
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
    // InternalDsl.g:1958:1: ruleAxis returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Axis' otherlv_2= 'x' ( (lv_x_3_0= RULE_INT ) ) otherlv_4= 'y' ( (lv_y_5_0= RULE_INT ) ) otherlv_6= 'z' ( (lv_z_7_0= RULE_INT ) ) ) ;
    public final EObject ruleAxis() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_x_3_0=null;
        Token otherlv_4=null;
        Token lv_y_5_0=null;
        Token otherlv_6=null;
        Token lv_z_7_0=null;


        	enterRule();

        try {
            // InternalDsl.g:1964:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Axis' otherlv_2= 'x' ( (lv_x_3_0= RULE_INT ) ) otherlv_4= 'y' ( (lv_y_5_0= RULE_INT ) ) otherlv_6= 'z' ( (lv_z_7_0= RULE_INT ) ) ) )
            // InternalDsl.g:1965:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Axis' otherlv_2= 'x' ( (lv_x_3_0= RULE_INT ) ) otherlv_4= 'y' ( (lv_y_5_0= RULE_INT ) ) otherlv_6= 'z' ( (lv_z_7_0= RULE_INT ) ) )
            {
            // InternalDsl.g:1965:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Axis' otherlv_2= 'x' ( (lv_x_3_0= RULE_INT ) ) otherlv_4= 'y' ( (lv_y_5_0= RULE_INT ) ) otherlv_6= 'z' ( (lv_z_7_0= RULE_INT ) ) )
            // InternalDsl.g:1966:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Axis' otherlv_2= 'x' ( (lv_x_3_0= RULE_INT ) ) otherlv_4= 'y' ( (lv_y_5_0= RULE_INT ) ) otherlv_6= 'z' ( (lv_z_7_0= RULE_INT ) )
            {
            // InternalDsl.g:1966:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDsl.g:1967:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDsl.g:1967:4: (lv_name_0_0= RULE_ID )
            // InternalDsl.g:1968:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_51); 

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

            otherlv_1=(Token)match(input,51,FOLLOW_52); 

            			newLeafNode(otherlv_1, grammarAccess.getAxisAccess().getAxisKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getAxisAccess().getXKeyword_2());
            		
            // InternalDsl.g:1992:3: ( (lv_x_3_0= RULE_INT ) )
            // InternalDsl.g:1993:4: (lv_x_3_0= RULE_INT )
            {
            // InternalDsl.g:1993:4: (lv_x_3_0= RULE_INT )
            // InternalDsl.g:1994:5: lv_x_3_0= RULE_INT
            {
            lv_x_3_0=(Token)match(input,RULE_INT,FOLLOW_53); 

            					newLeafNode(lv_x_3_0, grammarAccess.getAxisAccess().getXINTTerminalRuleCall_3_0());
            				

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

            otherlv_4=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getAxisAccess().getYKeyword_4());
            		
            // InternalDsl.g:2014:3: ( (lv_y_5_0= RULE_INT ) )
            // InternalDsl.g:2015:4: (lv_y_5_0= RULE_INT )
            {
            // InternalDsl.g:2015:4: (lv_y_5_0= RULE_INT )
            // InternalDsl.g:2016:5: lv_y_5_0= RULE_INT
            {
            lv_y_5_0=(Token)match(input,RULE_INT,FOLLOW_54); 

            					newLeafNode(lv_y_5_0, grammarAccess.getAxisAccess().getYINTTerminalRuleCall_5_0());
            				

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

            otherlv_6=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_6, grammarAccess.getAxisAccess().getZKeyword_6());
            		
            // InternalDsl.g:2036:3: ( (lv_z_7_0= RULE_INT ) )
            // InternalDsl.g:2037:4: (lv_z_7_0= RULE_INT )
            {
            // InternalDsl.g:2037:4: (lv_z_7_0= RULE_INT )
            // InternalDsl.g:2038:5: lv_z_7_0= RULE_INT
            {
            lv_z_7_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_z_7_0, grammarAccess.getAxisAccess().getZINTTerminalRuleCall_7_0());
            				

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
    // InternalDsl.g:2058:1: entryRuleCalibration returns [EObject current=null] : iv_ruleCalibration= ruleCalibration EOF ;
    public final EObject entryRuleCalibration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalibration = null;


        try {
            // InternalDsl.g:2058:52: (iv_ruleCalibration= ruleCalibration EOF )
            // InternalDsl.g:2059:2: iv_ruleCalibration= ruleCalibration EOF
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
    // InternalDsl.g:2065:1: ruleCalibration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Calibration' (otherlv_2= 'rising' ( (lv_rising_3_0= ruleFLOAT ) ) )? (otherlv_4= 'falling' ( (lv_falling_5_0= ruleFLOAT ) ) )? ) ;
    public final EObject ruleCalibration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_rising_3_0 = null;

        AntlrDatatypeRuleToken lv_falling_5_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2071:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Calibration' (otherlv_2= 'rising' ( (lv_rising_3_0= ruleFLOAT ) ) )? (otherlv_4= 'falling' ( (lv_falling_5_0= ruleFLOAT ) ) )? ) )
            // InternalDsl.g:2072:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Calibration' (otherlv_2= 'rising' ( (lv_rising_3_0= ruleFLOAT ) ) )? (otherlv_4= 'falling' ( (lv_falling_5_0= ruleFLOAT ) ) )? )
            {
            // InternalDsl.g:2072:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Calibration' (otherlv_2= 'rising' ( (lv_rising_3_0= ruleFLOAT ) ) )? (otherlv_4= 'falling' ( (lv_falling_5_0= ruleFLOAT ) ) )? )
            // InternalDsl.g:2073:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Calibration' (otherlv_2= 'rising' ( (lv_rising_3_0= ruleFLOAT ) ) )? (otherlv_4= 'falling' ( (lv_falling_5_0= ruleFLOAT ) ) )?
            {
            // InternalDsl.g:2073:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDsl.g:2074:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDsl.g:2074:4: (lv_name_0_0= RULE_ID )
            // InternalDsl.g:2075:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_55); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCalibrationAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCalibrationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,52,FOLLOW_56); 

            			newLeafNode(otherlv_1, grammarAccess.getCalibrationAccess().getCalibrationKeyword_1());
            		
            // InternalDsl.g:2095:3: (otherlv_2= 'rising' ( (lv_rising_3_0= ruleFLOAT ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==53) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalDsl.g:2096:4: otherlv_2= 'rising' ( (lv_rising_3_0= ruleFLOAT ) )
                    {
                    otherlv_2=(Token)match(input,53,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getCalibrationAccess().getRisingKeyword_2_0());
                    			
                    // InternalDsl.g:2100:4: ( (lv_rising_3_0= ruleFLOAT ) )
                    // InternalDsl.g:2101:5: (lv_rising_3_0= ruleFLOAT )
                    {
                    // InternalDsl.g:2101:5: (lv_rising_3_0= ruleFLOAT )
                    // InternalDsl.g:2102:6: lv_rising_3_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getCalibrationAccess().getRisingFLOATParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_57);
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

            // InternalDsl.g:2120:3: (otherlv_4= 'falling' ( (lv_falling_5_0= ruleFLOAT ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==54) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalDsl.g:2121:4: otherlv_4= 'falling' ( (lv_falling_5_0= ruleFLOAT ) )
                    {
                    otherlv_4=(Token)match(input,54,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getCalibrationAccess().getFallingKeyword_3_0());
                    			
                    // InternalDsl.g:2125:4: ( (lv_falling_5_0= ruleFLOAT ) )
                    // InternalDsl.g:2126:5: (lv_falling_5_0= ruleFLOAT )
                    {
                    // InternalDsl.g:2126:5: (lv_falling_5_0= ruleFLOAT )
                    // InternalDsl.g:2127:6: lv_falling_5_0= ruleFLOAT
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
    // InternalDsl.g:2149:1: entryRuleDynamics returns [EObject current=null] : iv_ruleDynamics= ruleDynamics EOF ;
    public final EObject entryRuleDynamics() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDynamics = null;


        try {
            // InternalDsl.g:2149:49: (iv_ruleDynamics= ruleDynamics EOF )
            // InternalDsl.g:2150:2: iv_ruleDynamics= ruleDynamics EOF
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
    // InternalDsl.g:2156:1: ruleDynamics returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Dynamics' (otherlv_2= 'friction' ( (lv_friction_3_0= ruleFLOAT ) ) )? (otherlv_4= 'damping' ( (lv_damping_5_0= ruleFLOAT ) ) )? ) ;
    public final EObject ruleDynamics() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_friction_3_0 = null;

        AntlrDatatypeRuleToken lv_damping_5_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2162:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Dynamics' (otherlv_2= 'friction' ( (lv_friction_3_0= ruleFLOAT ) ) )? (otherlv_4= 'damping' ( (lv_damping_5_0= ruleFLOAT ) ) )? ) )
            // InternalDsl.g:2163:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Dynamics' (otherlv_2= 'friction' ( (lv_friction_3_0= ruleFLOAT ) ) )? (otherlv_4= 'damping' ( (lv_damping_5_0= ruleFLOAT ) ) )? )
            {
            // InternalDsl.g:2163:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Dynamics' (otherlv_2= 'friction' ( (lv_friction_3_0= ruleFLOAT ) ) )? (otherlv_4= 'damping' ( (lv_damping_5_0= ruleFLOAT ) ) )? )
            // InternalDsl.g:2164:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Dynamics' (otherlv_2= 'friction' ( (lv_friction_3_0= ruleFLOAT ) ) )? (otherlv_4= 'damping' ( (lv_damping_5_0= ruleFLOAT ) ) )?
            {
            // InternalDsl.g:2164:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDsl.g:2165:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDsl.g:2165:4: (lv_name_0_0= RULE_ID )
            // InternalDsl.g:2166:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_58); 

            					newLeafNode(lv_name_0_0, grammarAccess.getDynamicsAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDynamicsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,55,FOLLOW_59); 

            			newLeafNode(otherlv_1, grammarAccess.getDynamicsAccess().getDynamicsKeyword_1());
            		
            // InternalDsl.g:2186:3: (otherlv_2= 'friction' ( (lv_friction_3_0= ruleFLOAT ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==56) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalDsl.g:2187:4: otherlv_2= 'friction' ( (lv_friction_3_0= ruleFLOAT ) )
                    {
                    otherlv_2=(Token)match(input,56,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getDynamicsAccess().getFrictionKeyword_2_0());
                    			
                    // InternalDsl.g:2191:4: ( (lv_friction_3_0= ruleFLOAT ) )
                    // InternalDsl.g:2192:5: (lv_friction_3_0= ruleFLOAT )
                    {
                    // InternalDsl.g:2192:5: (lv_friction_3_0= ruleFLOAT )
                    // InternalDsl.g:2193:6: lv_friction_3_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getDynamicsAccess().getFrictionFLOATParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_60);
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

            // InternalDsl.g:2211:3: (otherlv_4= 'damping' ( (lv_damping_5_0= ruleFLOAT ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==57) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalDsl.g:2212:4: otherlv_4= 'damping' ( (lv_damping_5_0= ruleFLOAT ) )
                    {
                    otherlv_4=(Token)match(input,57,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getDynamicsAccess().getDampingKeyword_3_0());
                    			
                    // InternalDsl.g:2216:4: ( (lv_damping_5_0= ruleFLOAT ) )
                    // InternalDsl.g:2217:5: (lv_damping_5_0= ruleFLOAT )
                    {
                    // InternalDsl.g:2217:5: (lv_damping_5_0= ruleFLOAT )
                    // InternalDsl.g:2218:6: lv_damping_5_0= ruleFLOAT
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
    // InternalDsl.g:2240:1: entryRuleMimic returns [EObject current=null] : iv_ruleMimic= ruleMimic EOF ;
    public final EObject entryRuleMimic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMimic = null;


        try {
            // InternalDsl.g:2240:46: (iv_ruleMimic= ruleMimic EOF )
            // InternalDsl.g:2241:2: iv_ruleMimic= ruleMimic EOF
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
    // InternalDsl.g:2247:1: ruleMimic returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Mimic' (otherlv_2= 'multiplier' ( (lv_multiplier_3_0= ruleFLOAT ) ) )? (otherlv_4= 'offSet' ( (lv_offSet_5_0= ruleFLOAT ) ) )? (otherlv_6= 'mimics' ( (otherlv_7= RULE_STRING ) ) )? ) ;
    public final EObject ruleMimic() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_multiplier_3_0 = null;

        AntlrDatatypeRuleToken lv_offSet_5_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2253:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Mimic' (otherlv_2= 'multiplier' ( (lv_multiplier_3_0= ruleFLOAT ) ) )? (otherlv_4= 'offSet' ( (lv_offSet_5_0= ruleFLOAT ) ) )? (otherlv_6= 'mimics' ( (otherlv_7= RULE_STRING ) ) )? ) )
            // InternalDsl.g:2254:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Mimic' (otherlv_2= 'multiplier' ( (lv_multiplier_3_0= ruleFLOAT ) ) )? (otherlv_4= 'offSet' ( (lv_offSet_5_0= ruleFLOAT ) ) )? (otherlv_6= 'mimics' ( (otherlv_7= RULE_STRING ) ) )? )
            {
            // InternalDsl.g:2254:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Mimic' (otherlv_2= 'multiplier' ( (lv_multiplier_3_0= ruleFLOAT ) ) )? (otherlv_4= 'offSet' ( (lv_offSet_5_0= ruleFLOAT ) ) )? (otherlv_6= 'mimics' ( (otherlv_7= RULE_STRING ) ) )? )
            // InternalDsl.g:2255:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Mimic' (otherlv_2= 'multiplier' ( (lv_multiplier_3_0= ruleFLOAT ) ) )? (otherlv_4= 'offSet' ( (lv_offSet_5_0= ruleFLOAT ) ) )? (otherlv_6= 'mimics' ( (otherlv_7= RULE_STRING ) ) )?
            {
            // InternalDsl.g:2255:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDsl.g:2256:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDsl.g:2256:4: (lv_name_0_0= RULE_ID )
            // InternalDsl.g:2257:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_61); 

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

            otherlv_1=(Token)match(input,58,FOLLOW_62); 

            			newLeafNode(otherlv_1, grammarAccess.getMimicAccess().getMimicKeyword_1());
            		
            // InternalDsl.g:2277:3: (otherlv_2= 'multiplier' ( (lv_multiplier_3_0= ruleFLOAT ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==59) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalDsl.g:2278:4: otherlv_2= 'multiplier' ( (lv_multiplier_3_0= ruleFLOAT ) )
                    {
                    otherlv_2=(Token)match(input,59,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getMimicAccess().getMultiplierKeyword_2_0());
                    			
                    // InternalDsl.g:2282:4: ( (lv_multiplier_3_0= ruleFLOAT ) )
                    // InternalDsl.g:2283:5: (lv_multiplier_3_0= ruleFLOAT )
                    {
                    // InternalDsl.g:2283:5: (lv_multiplier_3_0= ruleFLOAT )
                    // InternalDsl.g:2284:6: lv_multiplier_3_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getMimicAccess().getMultiplierFLOATParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_63);
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

            // InternalDsl.g:2302:3: (otherlv_4= 'offSet' ( (lv_offSet_5_0= ruleFLOAT ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==60) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalDsl.g:2303:4: otherlv_4= 'offSet' ( (lv_offSet_5_0= ruleFLOAT ) )
                    {
                    otherlv_4=(Token)match(input,60,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getMimicAccess().getOffSetKeyword_3_0());
                    			
                    // InternalDsl.g:2307:4: ( (lv_offSet_5_0= ruleFLOAT ) )
                    // InternalDsl.g:2308:5: (lv_offSet_5_0= ruleFLOAT )
                    {
                    // InternalDsl.g:2308:5: (lv_offSet_5_0= ruleFLOAT )
                    // InternalDsl.g:2309:6: lv_offSet_5_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getMimicAccess().getOffSetFLOATParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_64);
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

            // InternalDsl.g:2327:3: (otherlv_6= 'mimics' ( (otherlv_7= RULE_STRING ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==61) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalDsl.g:2328:4: otherlv_6= 'mimics' ( (otherlv_7= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,61,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getMimicAccess().getMimicsKeyword_4_0());
                    			
                    // InternalDsl.g:2332:4: ( (otherlv_7= RULE_STRING ) )
                    // InternalDsl.g:2333:5: (otherlv_7= RULE_STRING )
                    {
                    // InternalDsl.g:2333:5: (otherlv_7= RULE_STRING )
                    // InternalDsl.g:2334:6: otherlv_7= RULE_STRING
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMimicRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(otherlv_7, grammarAccess.getMimicAccess().getMimicsJointCrossReference_4_1_0());
                    					

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
    // InternalDsl.g:2350:1: entryRuleSafetyController returns [EObject current=null] : iv_ruleSafetyController= ruleSafetyController EOF ;
    public final EObject entryRuleSafetyController() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSafetyController = null;


        try {
            // InternalDsl.g:2350:57: (iv_ruleSafetyController= ruleSafetyController EOF )
            // InternalDsl.g:2351:2: iv_ruleSafetyController= ruleSafetyController EOF
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
    // InternalDsl.g:2357:1: ruleSafetyController returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'SafetyController' (otherlv_2= 'softLowerLimit' ( (lv_softLowerLimit_3_0= ruleFLOAT ) ) )? (otherlv_4= 'softUpperLimit' ( (lv_softUpperLimit_5_0= ruleFLOAT ) ) )? (otherlv_6= 'k_position' ( (lv_k_position_7_0= ruleFLOAT ) ) )? (otherlv_8= 'k_velocity' ( (lv_k_velocity_9_0= ruleFLOAT ) ) )? ) ;
    public final EObject ruleSafetyController() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
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
            // InternalDsl.g:2363:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'SafetyController' (otherlv_2= 'softLowerLimit' ( (lv_softLowerLimit_3_0= ruleFLOAT ) ) )? (otherlv_4= 'softUpperLimit' ( (lv_softUpperLimit_5_0= ruleFLOAT ) ) )? (otherlv_6= 'k_position' ( (lv_k_position_7_0= ruleFLOAT ) ) )? (otherlv_8= 'k_velocity' ( (lv_k_velocity_9_0= ruleFLOAT ) ) )? ) )
            // InternalDsl.g:2364:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'SafetyController' (otherlv_2= 'softLowerLimit' ( (lv_softLowerLimit_3_0= ruleFLOAT ) ) )? (otherlv_4= 'softUpperLimit' ( (lv_softUpperLimit_5_0= ruleFLOAT ) ) )? (otherlv_6= 'k_position' ( (lv_k_position_7_0= ruleFLOAT ) ) )? (otherlv_8= 'k_velocity' ( (lv_k_velocity_9_0= ruleFLOAT ) ) )? )
            {
            // InternalDsl.g:2364:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'SafetyController' (otherlv_2= 'softLowerLimit' ( (lv_softLowerLimit_3_0= ruleFLOAT ) ) )? (otherlv_4= 'softUpperLimit' ( (lv_softUpperLimit_5_0= ruleFLOAT ) ) )? (otherlv_6= 'k_position' ( (lv_k_position_7_0= ruleFLOAT ) ) )? (otherlv_8= 'k_velocity' ( (lv_k_velocity_9_0= ruleFLOAT ) ) )? )
            // InternalDsl.g:2365:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'SafetyController' (otherlv_2= 'softLowerLimit' ( (lv_softLowerLimit_3_0= ruleFLOAT ) ) )? (otherlv_4= 'softUpperLimit' ( (lv_softUpperLimit_5_0= ruleFLOAT ) ) )? (otherlv_6= 'k_position' ( (lv_k_position_7_0= ruleFLOAT ) ) )? (otherlv_8= 'k_velocity' ( (lv_k_velocity_9_0= ruleFLOAT ) ) )?
            {
            // InternalDsl.g:2365:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDsl.g:2366:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDsl.g:2366:4: (lv_name_0_0= RULE_ID )
            // InternalDsl.g:2367:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_65); 

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

            otherlv_1=(Token)match(input,62,FOLLOW_66); 

            			newLeafNode(otherlv_1, grammarAccess.getSafetyControllerAccess().getSafetyControllerKeyword_1());
            		
            // InternalDsl.g:2387:3: (otherlv_2= 'softLowerLimit' ( (lv_softLowerLimit_3_0= ruleFLOAT ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==63) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalDsl.g:2388:4: otherlv_2= 'softLowerLimit' ( (lv_softLowerLimit_3_0= ruleFLOAT ) )
                    {
                    otherlv_2=(Token)match(input,63,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getSafetyControllerAccess().getSoftLowerLimitKeyword_2_0());
                    			
                    // InternalDsl.g:2392:4: ( (lv_softLowerLimit_3_0= ruleFLOAT ) )
                    // InternalDsl.g:2393:5: (lv_softLowerLimit_3_0= ruleFLOAT )
                    {
                    // InternalDsl.g:2393:5: (lv_softLowerLimit_3_0= ruleFLOAT )
                    // InternalDsl.g:2394:6: lv_softLowerLimit_3_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getSafetyControllerAccess().getSoftLowerLimitFLOATParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_67);
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

            // InternalDsl.g:2412:3: (otherlv_4= 'softUpperLimit' ( (lv_softUpperLimit_5_0= ruleFLOAT ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==64) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalDsl.g:2413:4: otherlv_4= 'softUpperLimit' ( (lv_softUpperLimit_5_0= ruleFLOAT ) )
                    {
                    otherlv_4=(Token)match(input,64,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getSafetyControllerAccess().getSoftUpperLimitKeyword_3_0());
                    			
                    // InternalDsl.g:2417:4: ( (lv_softUpperLimit_5_0= ruleFLOAT ) )
                    // InternalDsl.g:2418:5: (lv_softUpperLimit_5_0= ruleFLOAT )
                    {
                    // InternalDsl.g:2418:5: (lv_softUpperLimit_5_0= ruleFLOAT )
                    // InternalDsl.g:2419:6: lv_softUpperLimit_5_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getSafetyControllerAccess().getSoftUpperLimitFLOATParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_68);
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

            // InternalDsl.g:2437:3: (otherlv_6= 'k_position' ( (lv_k_position_7_0= ruleFLOAT ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==65) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalDsl.g:2438:4: otherlv_6= 'k_position' ( (lv_k_position_7_0= ruleFLOAT ) )
                    {
                    otherlv_6=(Token)match(input,65,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getSafetyControllerAccess().getK_positionKeyword_4_0());
                    			
                    // InternalDsl.g:2442:4: ( (lv_k_position_7_0= ruleFLOAT ) )
                    // InternalDsl.g:2443:5: (lv_k_position_7_0= ruleFLOAT )
                    {
                    // InternalDsl.g:2443:5: (lv_k_position_7_0= ruleFLOAT )
                    // InternalDsl.g:2444:6: lv_k_position_7_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getSafetyControllerAccess().getK_positionFLOATParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_69);
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

            // InternalDsl.g:2462:3: (otherlv_8= 'k_velocity' ( (lv_k_velocity_9_0= ruleFLOAT ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==66) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalDsl.g:2463:4: otherlv_8= 'k_velocity' ( (lv_k_velocity_9_0= ruleFLOAT ) )
                    {
                    otherlv_8=(Token)match(input,66,FOLLOW_12); 

                    				newLeafNode(otherlv_8, grammarAccess.getSafetyControllerAccess().getK_velocityKeyword_5_0());
                    			
                    // InternalDsl.g:2467:4: ( (lv_k_velocity_9_0= ruleFLOAT ) )
                    // InternalDsl.g:2468:5: (lv_k_velocity_9_0= ruleFLOAT )
                    {
                    // InternalDsl.g:2468:5: (lv_k_velocity_9_0= ruleFLOAT )
                    // InternalDsl.g:2469:6: lv_k_velocity_9_0= ruleFLOAT
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
    // InternalDsl.g:2491:1: entryRuleFLOAT returns [String current=null] : iv_ruleFLOAT= ruleFLOAT EOF ;
    public final String entryRuleFLOAT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFLOAT = null;


        try {
            // InternalDsl.g:2491:45: (iv_ruleFLOAT= ruleFLOAT EOF )
            // InternalDsl.g:2492:2: iv_ruleFLOAT= ruleFLOAT EOF
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
    // InternalDsl.g:2498:1: ruleFLOAT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleFLOAT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalDsl.g:2504:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalDsl.g:2505:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalDsl.g:2505:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalDsl.g:2506:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_70); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getFLOATAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,67,FOLLOW_12); 

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
    // InternalDsl.g:2529:1: ruleJointType returns [Enumerator current=null] : ( (enumLiteral_0= 'Revolute' ) | (enumLiteral_1= 'Continous' ) | (enumLiteral_2= 'Fixed' ) | (enumLiteral_3= 'Prismatic' ) ) ;
    public final Enumerator ruleJointType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDsl.g:2535:2: ( ( (enumLiteral_0= 'Revolute' ) | (enumLiteral_1= 'Continous' ) | (enumLiteral_2= 'Fixed' ) | (enumLiteral_3= 'Prismatic' ) ) )
            // InternalDsl.g:2536:2: ( (enumLiteral_0= 'Revolute' ) | (enumLiteral_1= 'Continous' ) | (enumLiteral_2= 'Fixed' ) | (enumLiteral_3= 'Prismatic' ) )
            {
            // InternalDsl.g:2536:2: ( (enumLiteral_0= 'Revolute' ) | (enumLiteral_1= 'Continous' ) | (enumLiteral_2= 'Fixed' ) | (enumLiteral_3= 'Prismatic' ) )
            int alt45=4;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt45=1;
                }
                break;
            case 69:
                {
                alt45=2;
                }
                break;
            case 70:
                {
                alt45=3;
                }
                break;
            case 71:
                {
                alt45=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalDsl.g:2537:3: (enumLiteral_0= 'Revolute' )
                    {
                    // InternalDsl.g:2537:3: (enumLiteral_0= 'Revolute' )
                    // InternalDsl.g:2538:4: enumLiteral_0= 'Revolute'
                    {
                    enumLiteral_0=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getJointTypeAccess().getRevoluteEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getJointTypeAccess().getRevoluteEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:2545:3: (enumLiteral_1= 'Continous' )
                    {
                    // InternalDsl.g:2545:3: (enumLiteral_1= 'Continous' )
                    // InternalDsl.g:2546:4: enumLiteral_1= 'Continous'
                    {
                    enumLiteral_1=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getJointTypeAccess().getContinousEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getJointTypeAccess().getContinousEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:2553:3: (enumLiteral_2= 'Fixed' )
                    {
                    // InternalDsl.g:2553:3: (enumLiteral_2= 'Fixed' )
                    // InternalDsl.g:2554:4: enumLiteral_2= 'Fixed'
                    {
                    enumLiteral_2=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getJointTypeAccess().getFixedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getJointTypeAccess().getFixedEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:2561:3: (enumLiteral_3= 'Prismatic' )
                    {
                    // InternalDsl.g:2561:3: (enumLiteral_3= 'Prismatic' )
                    // InternalDsl.g:2562:4: enumLiteral_3= 'Prismatic'
                    {
                    enumLiteral_3=(Token)match(input,71,FOLLOW_2); 

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
    static final String dfa_1s = "\37\uffff";
    static final String dfa_2s = "\1\2\36\uffff";
    static final String dfa_3s = "\2\4\1\uffff\2\4\6\6\1\25\6\103\1\uffff\6\6\6\4";
    static final String dfa_4s = "\1\15\1\16\1\uffff\1\4\1\24\6\6\1\55\6\103\1\uffff\6\6\5\24\1\4";
    static final String dfa_5s = "\2\uffff\1\2\17\uffff\1\1\14\uffff";
    static final String dfa_6s = "\37\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\7\uffff\2\2",
            "\1\2\11\uffff\1\3",
            "",
            "\1\4",
            "\1\13\12\uffff\1\5\1\6\1\7\1\10\1\11\1\12",
            "\1\14",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\22\17\uffff\1\2\3\uffff\1\2\1\uffff\1\2\1\uffff\1\2",
            "\1\23",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\27",
            "\1\30",
            "",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\13\13\uffff\1\6\1\7\1\10\1\11\1\12",
            "\1\13\14\uffff\1\7\1\10\1\11\1\12",
            "\1\13\15\uffff\1\10\1\11\1\12",
            "\1\13\16\uffff\1\11\1\12",
            "\1\13\17\uffff\1\12",
            "\1\13"
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
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000001F8002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000001F0002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000001E0002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000001C0002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000780000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000700000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000048000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000101000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0300000000000002L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x3800000000000002L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x3000000000000002L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000007L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000007L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000006L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});

}